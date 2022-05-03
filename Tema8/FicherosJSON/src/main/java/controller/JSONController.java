package controller;

import com.google.gson.Gson;
import model.Asignatura;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class JSONController {
    String jsonString = "{\n" +
            "  \"nombre\": \"Sergio\",\n" +
            "  \"apellidos\": \"Perez Sanchez\",\n" +
            "  \"edad\": 19,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    ArrayList<Asignatura> listaAsignaturas;

    public void pasarStringJson(){
        //System.out.println(jsonString);
        // STRING --> JSON (org.json)

        JSONObject jsonObject = new JSONObject(jsonString);
        String nombre =(String) jsonObject.get("nombre");
        String apellidos = jsonObject.getString("apellidos");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");

        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(edad);
        System.out.println("Tus hobbies son: ");
        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }

    public void leerFicheroJson(){
        File file = new File("src/main/resources/persona.json");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            // br.readLine() --> linea completa
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();

            while ((linea = br.readLine())!= null){
                lecturaCompleta.append(linea);
            }


            // PASAR UN STRING A JSON

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");

            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
                Gson gson = new Gson();

                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(),Conocimiento.class);


                /*String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println("Los detalles del conocimiento " + concepto + " son: ");
                JSONArray detalles = conocimiento.getJSONArray("detalle");
                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(j);
                    System.out.println(detalle);
                }*/
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

    public void leerJSONAsignaturas(int curso, String ciclo){
        //JSONArray asignaturas;

        File file = new File("src/main/resources/asignaturas.json");
        BufferedReader br = null;
        listaAsignaturas = new ArrayList();

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();

            while ((linea = br.readLine())!= null){
                lecturaCompleta.append(linea);
            }


            JSONObject jsonAsignaturas = new JSONObject(lecturaCompleta.toString());
            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");

            for (int i = 0; i < asignaturas.length(); i++) {
                JSONObject asignaturaJSON = asignaturas.getJSONObject(0);
                Gson gson = new Gson();
                Asignatura asignatura = gson.fromJson(asignaturaJSON.toString(),Asignatura.class);
                listaAsignaturas.add(asignatura);
                //caracteristicasAsignatura(asignatura,ciclo,curso);

                caracteristicasAsignaturas(ciclo, curso);

            }

            System.out.println(asignaturas);

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

    public void caracteristicasAsignaturas(String ciclo, int curso){
        for ( Asignatura item : listaAsignaturas ) {
            if (item.getCurso() == curso && item.getCiclo().contains(ciclo));
            System.out.println(item.getSiglas());
            System.out.println(item.getCiclo());
            System.out.println(item.getCurso());
            System.out.println("Conocimientos");
        }
    }

    public void caracteristicasAsignatura (Asignatura asignatura, String ciclo, int curso){

        if (asignatura.getCiclo().contains(ciclo) && asignatura.getCurso() == curso) {
            System.out.println(asignatura.getCiclo());
            System.out.println(asignatura.getCurso());
        }
    }

    public void lecturaJSONAPI(int numero){
        String urlString = "https://randomuser.me/api/?results="+numero;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection =(HttpURLConnection) url.openConnection();
            // contestacion
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = br.readLine();
            JSONObject jsonObject = new JSONObject(lectura);
            System.out.println(lectura);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void lecturaUsers(){

        String urlString = "https://randomuser.me/api/?results=2";
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //File file;
            //FileReader fileReader
            BufferedReader br;

            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

           String response = br.readLine();
           JSONObject responeJSON = new JSONObject(response);
            JSONArray arrayResultados = responeJSON.getJSONArray("results");
            JSONObject objetoResultado = arrayResultados.getJSONObject(0);

            for (int i = 0; i < arrayResultados.length(); i++) {

            }

            System.out.println(objetoResultado);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
