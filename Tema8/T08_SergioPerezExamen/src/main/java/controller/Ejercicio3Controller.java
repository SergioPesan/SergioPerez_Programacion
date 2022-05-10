package controller;

import com.google.gson.Gson;
import model.Pelicula;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.naming.Name;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Ejercicio3Controller {

    private ArrayList<Pelicula> listaCartelera;



    public void carteleraActual() {

        if (listaCartelera == null){
            listaCartelera = new ArrayList<>();
        }
        String urlString = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=es-ES";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea = br.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultado = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultado.length(); i++) {
                JSONObject objectResultado = arrayResultado.getJSONObject(i);
                //System.out.println(objectResultado);
               String titulo,fechaLanzamiento,descripcion,poster;

               titulo = objectResultado.getString("original_title");
               fechaLanzamiento = objectResultado.getString("release_date");
               descripcion = objectResultado.getString("overview");
               poster = objectResultado.getString("poster_path");

                System.out.println("Título: " + titulo);
                System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
                System.out.println("Descripción: " + descripcion );
                System.out.println("Póster: https://image.tmdb.org/t/p/w500/" + poster);
                System.out.printf("\n");

                /*Gson gson = new Gson();
                Name tituloJAVA = gson.fromJson(titulo,Name.class);
                Name fechaJAVA = gson.fromJson(fechaLanzamiento,Name.class);
                Name descripcionJAVA = gson.fromJson(descripcion,Name.class);
                Name posterJAVA = gson.fromJson(poster,Name.class);

                listaCartelera.add(new Pelicula(titulo,fechaLanzamiento,descripcion));


                File file = new File("src/main/resources/cartelera.bin");
                ObjectOutputStream oos = null;

                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(listaCartelera);*/
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void proximaCartelera(){
        String urlString = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=es-ES";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea = br.readLine())!=null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultado = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultado.length(); i++) {
                JSONObject objectResultado = arrayResultado.getJSONObject(i);
                //System.out.println(objectResultado);
                String titulo,fechaLanzamiento,descripcion,poster;

                titulo = objectResultado.getString("original_title");
                fechaLanzamiento = objectResultado.getString("release_date");
                descripcion = objectResultado.getString("overview");
                poster = objectResultado.getString("poster_path");

                System.out.println("Título: " + titulo);
                System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
                System.out.println("Descripción: " + descripcion );
                System.out.println("Póster: https://image.tmdb.org/t/p/w500/" + poster);
                System.out.printf("\n");


                /*Gson gson = new Gson();
                Name tituloJAVA = gson.fromJson(titulo,Name.class);
                Name fechaJAVA = gson.fromJson(fechaLanzamiento,Name.class);
                Name descripcionJAVA = gson.fromJson(descripcion,Name.class);
                Name posterJAVA = gson.fromJson(poster,Name.class);

                listaCartelera.add(new Pelicula(titulo,fechaLanzamiento,descripcion));


                File file = new File("src/main/resources/proximamente.bin");
                ObjectOutputStream oos = null;

                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(listaCartelera);*/
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}