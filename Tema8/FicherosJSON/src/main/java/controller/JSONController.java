package controller;

import com.google.gson.Gson;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.*;

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
}
