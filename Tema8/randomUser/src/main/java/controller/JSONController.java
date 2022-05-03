package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import javax.naming.Name;

public class JSONController {
    public void lecturaUsuarios(int numero, String genero){
        //String urlString = "https://randomuser.me/api/?results="+numero+"&gender="+genero;
        String urlFormat = String.format("https://randomuser.me/api/?results=%d&gender=male%s",numero,genero);
        System.out.println(urlFormat);

        BufferedReader reader = null;
        try {
            URL url = new URL(urlFormat);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = null;

            while ((linea =  reader.readLine())!= null){
                stringBuilder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray arrayResults = jsonObject.getJSONArray("results");
            for (int i = 0; i < arrayResults.length(); i++) {
                JSONObject objetoResultado = arrayResults.getJSONObject(i);
                String mail = objetoResultado.getString("email");
                JSONObject name = objetoResultado.getJSONObject("name");
                String imagen = objetoResultado.getJSONObject("picture").getString("medium");
                String title = name.getString("title");
                String first = name.getString("first");
                String last = name.getString("last");
                System.out.println(title+". "+first+" "+last);
                /*Gson gson = new Gson();
                Name nameJAVA = gson.fromJson(name.toString,Name.class);
                System.out.printf("%s. %s %s",nameJAVA.getTitle(), nameJAVA.getFirst(),nameJAVA.getLast());*/
                System.out.println(mail);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
