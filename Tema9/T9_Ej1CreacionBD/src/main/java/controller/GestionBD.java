package controller;

import database.SchemeBD;
import model.Usuario;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class GestionBD {

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void getConnection(){

        String newConnectionURL = "jdbc:mysql://"+ SchemeBD.HOST+ "/"
                +  SchemeBD.DTBS + "?" + "user=" + SchemeBD.USER
                + "&password=" + SchemeBD.PASS;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeConnection(){
        try {
            if (conn!= null){
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertarPerfil(){
        // Statement --> no trata tipos
        // PrepareStatement --> trata tipos
        Statement statement = null;
        getConnection();
        try {
            statement = conn.createStatement();
            // execute --> bool
            // executeUpdate --> int(afectados)
            String query = "INSERT INTO %s (%s) VALUES ('Gerente')";
            statement.execute(String.format(query,SchemeBD.TAB_PERFIL
                    ,SchemeBD.COL_NOMBRE));
            String query2 = "INSERT INTO %s (%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2,SchemeBD.TAB_PERFIL
                    ,SchemeBD.COL_NOMBRE));
            String query3 = "INSERT INTO %s (%s) VALUES ('Director')";
            statement.execute(String.format(query3,SchemeBD.TAB_PERFIL
                    ,SchemeBD.COL_NOMBRE));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }


    }

    public void agregarUsuario(){
    }

    public void selectSueldos(int sueldoParam){
        getConnection();
        Statement statement = null;

        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM %s WHERE %s > %d";
            String queryFormat = String.format(query,SchemeBD.TAB_USER, SchemeBD.COL_SUELDO,sueldoParam);
            ResultSet rows = statement.executeQuery(queryFormat);
            rows.first();
            while (rows.next()){
                String nombre = rows.getString(SchemeBD.COL_NOMBRE);
                int sueldo = rows.getInt(SchemeBD.COL_SUELDO);
                System.out.println(nombre);
                System.out.println(sueldo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    private void addUserIndividual(){
        getConnection();
        Usuario usuario = new Usuario();
        String query = "INSERT INTO %s (%s,%s,%s,%s,%s) VALUE (?,?,?,?,?)";
        String queryFormat = String.format(query,SchemeBD.TAB_USER,
                SchemeBD.COL_NOMBRE,SchemeBD.COL_APELLIDO,SchemeBD.COL_TELEFONO,
                SchemeBD.COL_PAIS, SchemeBD.COL_FK_ID);
        PreparedStatement preparedStatement = null;


        try {
            preparedStatement = conn.prepareStatement(queryFormat);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2, usuario.getApellido());
            preparedStatement.setInt(3,usuario.getTelefono());
            preparedStatement.setString(4, usuario.getPais());
            preparedStatement.setInt(3, usuario.getId_perfil());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

}
