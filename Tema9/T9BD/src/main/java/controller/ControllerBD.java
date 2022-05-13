package controller;

import database.SchemeDB;
import model.Alumno;

import java.sql.*;
import java.util.ArrayList;

public class ControllerBD {

    private Connection conn;
    // no comprueba tipos
    private Statement statement;
    // comprueba tipos de datos
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private ArrayList<Alumno> listaAlumnos;


    private void getConnection(){
        String host = "127.0.0.1:3306";
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "ADMIN";

        // jdbc:mysql://127.0.0.1:3306/colegio?user=root&password=ADMIN
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;


        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
try {
        if (conn!= null){
            conn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    public void closeConnection() {


    }

    public void insertarAlumnoStatement(){
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;
        // INSERT INTO alumnos (nombre,apellido,edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            statement = conn.createStatement();
            /*int numeroRow = statement.executeUpdate("INSERT INTO "+SchemeDB.TAB_ALU+"("
                    +SchemeDB.COL_NOMBRE +","+SchemeDB.COL_APELLIDO+","+SchemeDB.COL_EDAD+") VALUES ('"
                    +nombre+"','"+apellido +"',"+edad+")");*/
            String queryFormat = String.format("INSERT INTO %s (%s,%s,%d) VALUES ('%s','%s',%d)",
                    SchemeDB.TAB_ALU,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD,
                    nombre,apellido,edad) ;
            int numeroRow = statement.executeUpdate(queryFormat);

            // System.out.println(numeroRow);



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }

    /*Desde la entrada, pedir al usuario datos para introducir alumnos (recursivo)
    el alumno se mete en la base de datos mediante un modelo*/

    public void insertarAlumnoStatement(Alumno alumno){
        String nombre = alumno.getNombre();
        String apellido = alumno.getApellido();
        int edad = alumno.getEdad();
        // INSERT INTO alumnos (nombre,apellido,edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            statement = conn.createStatement();
            /*int numeroRow = statement.executeUpdate("INSERT INTO "+SchemeDB.TAB_ALU+"("
                    +SchemeDB.COL_NOMBRE +","+SchemeDB.COL_APELLIDO+","+SchemeDB.COL_EDAD+") VALUES ('"
                    +nombre+"','"+apellido +"',"+edad+")");*/
            String queryFormat = String.format("INSERT INTO %s (%s,%s,%d) VALUES ('%s','%s',%d)",
                    SchemeDB.TAB_ALU,SchemeDB.COL_NOMBRE,SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD,
                    nombre,apellido,edad);

            int numeroRow = statement.executeUpdate(queryFormat);
            if (numeroRow>0){
                System.out.println("Alumno insertado correctamente");
            }else {
                System.out.printf("%d alumnos no se han podido insertar",numeroRow);
            }

            // System.out.println(numeroRow);



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarAlumnoPrepare(){
        String nombre = "Borja";
        String apellido = "Martin";
        int edad = 38;

        String query = "INSERT INTO alumnos (nombre,apellido,edad) VALUES (?,?,?)";

        try {
            // no ejecuta la query --> la deja preparada
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setInt(3,edad);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    // modificar la edad de un usuario. Para ello el sistema pedira
    //el nombre del usuario y la nueva edad del mismo. Una vez realizada la
    //modificacion el sistema avisará del numero de usuarios que ha cambiado
    //SE HAN ACTUALIZADO X USUARIOS

    //borrar los usuarios. Para ello el sistema pedira una edad y borra todos
    //aquellos usuarios que tengan una edad inferior a la pedida por el sistema
    //el sistema avisara del numero de usuarios borrados

    public void actualizarEdadAlumno(String nombre,int edad){
        String query = "UPDATE %s SET %s = ? WHERE %s = ?";
        // INSERT INTO alumnos (nombre,apellido,edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALU,
                    SchemeDB.COL_EDAD, SchemeDB.COL_NOMBRE));
            preparedStatement.setInt(1,edad);
            preparedStatement.setString(2,nombre);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Los cambios afectados son: "+rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void eliminarAlumno(int edad){
        String queryFormat = String.format("DELETE FROM %s WHERE ? < %s");
        // INSERT INTO alumnos (nombre,apellido,edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            preparedStatement = conn.prepareStatement(String.format(queryFormat,SchemeDB.TAB_ALU,
                    SchemeDB.COL_EDAD));
            preparedStatement.setInt(1,edad);
            int rows = preparedStatement.executeUpdate();



            // System.out.println(numeroRow);



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void getResultados(Alumno alumno){
        getConnection();
        try {
            listaAlumnos = new ArrayList();
            //Alumno alumno = null;


            statement = conn.createStatement();
            String query = "SELECT * FROM " + SchemeDB.TAB_ALU;
            resultSet = statement.executeQuery(query);
            /*resultSet.last();
            resultSet.previous();*/

            while (resultSet.next()){
                String nombre = resultSet.getString(SchemeDB.COL_NOMBRE);
                String apellido = resultSet.getString(SchemeDB.COL_APELLIDO);
                int edad = resultSet.getInt(SchemeDB.COL_EDAD);
                int id = resultSet.getInt(SchemeDB.COL_ID);
                listaAlumnos.add(new Alumno(nombre,apellido,edad));
                listaAlumnos.add(alumno);
                System.out.println(alumno.getNombre());
                System.out.println(alumno.getApellido());
                System.out.println(alumno.getEdad());
                //System.out.println(id);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
