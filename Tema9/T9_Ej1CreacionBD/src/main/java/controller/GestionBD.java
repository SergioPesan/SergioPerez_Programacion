package controller;

import database.SchemeBD;

import java.sql.*;

public class GestionBD {

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void getConnection(){
        String host = "127.0.0.1:3306";
        String dtbs = SchemeBD.DB_NAME;
        String user = "root";
        String pass = "ADMIN";

        String newConnectionURL = "jdbc:mysql://"+ host + "/" +  dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void closeConnection(){
        try {
            if (conn!= null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarPerfil(){
        String nombre1 = "trabajador";
        String nombre2 = "director";
        String nombre3 = "gerente";


    }
}
