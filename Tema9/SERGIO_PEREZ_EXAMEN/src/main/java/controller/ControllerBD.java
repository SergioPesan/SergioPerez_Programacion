package controller;

import com.google.gson.Gson;
import database.SchemeBD;
import model.Factura;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBD {

    private ArrayList<Factura> lista;
    private Connection conn;
    private PreparedStatement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;

    private void getConnection(){
        String host = SchemeBD.HOST;
        String dtbs = SchemeBD.DTBS;
        String user = SchemeBD.USER;
        String pass = SchemeBD.PASS;

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection(){
        try {
            if(conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarFacturas(){
        if (lista==null){
            lista = new ArrayList<>();
        }

        String urlString = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";
        BufferedReader br = null;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = null;

            while ((linea=br.readLine())!=null){
                stringBuilder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray arrayResultados = jsonObject.getJSONArray("results");
            JSONArray arrayElementos;
            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                arrayElementos = objetoResultado.getJSONArray("elementos");
                int total = 1;
                for (int j = 0; j < arrayElementos.length(); j++) {
                    total++;
                }

                String id =objetoResultado.getString("_id");
                String compania = objetoResultado.getString("company");
                String pais = objetoResultado.getString("country");
                String telefono = objetoResultado.getString("phone");

                /*Gson gson = new Gson();
                Factura factura = gson.fromJson(objetoResultado.toString(),Factura.class);*/
                lista.add(new Factura(id,compania,pais,telefono,total));

                getConnection();
                try {
                    /*String queryFormat = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) VALUES (%s,%s,%s,%s,%d)",
                            SchemeBD.TAB_FACTURA,SchemeBD.COL_ID,SchemeBD.COL_COMPANIA,SchemeBD.COL_PAIS,
                            SchemeBD.COL_TELEFONO,SchemeBD.COL_TOTAL, id,compania,pais,telefono,total);*/
                    /*statement = conn.createStatement(queryFormat);*/
                    String queryFormat = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) VALUES (?,?,?,?,?)",
                            SchemeBD.TAB_FACTURA,SchemeBD.COL_ID,SchemeBD.COL_COMPANIA,SchemeBD.COL_PAIS,
                            SchemeBD.COL_TELEFONO,SchemeBD.COL_TOTAL);
                    preparedStatement = conn.prepareStatement(queryFormat);
                    preparedStatement.setString(1,id);
                    preparedStatement.setString(2,compania);
                    preparedStatement.setString(3,pais);
                    preparedStatement.setString(4,telefono);
                    preparedStatement.setInt(5,total);
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


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void buscarTotal(){
        Scanner scanner = new Scanner(System.in);
        int total;
        ArrayList<Factura> listaFactura = new ArrayList<>();

        System.out.println("Elige un total para realizar la consulta:");
        total = scanner.nextInt();

        try {
            statement = conn.createStatement();
            String queryFormat = String.format("SELECT * FROM %s WHERE %s >= %d",
                    SchemeBD.TAB_FACTURA,SchemeBD.COL_TOTAL, total);
            resultSet = statement.executeQuery(queryFormat);

            while (resultSet.next()){
                String id = resultSet.getString(SchemeBD.COL_ID);
                String compania = resultSet.getString(SchemeBD.COL_COMPANIA);
                String pais = resultSet.getString(SchemeBD.COL_PAIS);
                String telefono = resultSet.getString(SchemeBD.COL_TELEFONO);
                int totalFactura = resultSet.getInt(SchemeBD.COL_TOTAL);
                Factura factura = new Factura(id,compania,pais,telefono,totalFactura);
                String query = String.format("INSERT INTO %s (%s,%s,%s,%s,%s) VALUES (?,?,?,?,?)");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
