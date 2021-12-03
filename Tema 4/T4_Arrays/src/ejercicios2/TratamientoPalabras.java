package ejercicios2;

public class TratamientoPalabras {
    public static void main(String[] args) {

        String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
        // palabraTratar = "esto es un palabra"
        System.out.println(palabraTratar.toUpperCase());
        // palabraTratar = "esto es un palabra"

        String palabraComparar = "ejemplo de palabra";
        if(palabraTratar.toLowerCase().equals(palabraComparar.toLowerCase())){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        System.out.println(fraseCompleta.length());

        //Saber cunatas palabras tengo
        String[] palabras = fraseCompleta.split(" ");
        System.out.println("El numero de palabras es: " + palabras.length);

        //saber cuantas letras tengo
        int letrasTotales = 0;
        for ( String item: palabras) {
            letrasTotales += item.length();
        }
        System.out.println("El numero total de letras es: " + letrasTotales);

        /*fraseCompleta = fraseCompleta.replaceAll(" ", "")
                .replaceAll(".","")
                .replaceAll(",","");*/

        //System.out.println(fraseCompleta);

        //System.out.println(fraseCompleta.replaceAll(" ","").length());

        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' ') {
                System.out.print(fraseCompleta.charAt(i));
            }
        }

        System.out.println(" ");

        System.out.println(fraseCompleta.indexOf("a"));
        //fraseCompleta.indexOf("e",10);
        //System.out.println(fraseCompleta.substring(10,20));
        String correo = "sergio.perez@cesjuanpablosegundo.es";
        //sergio.perez
        //cesjuanpablosegundo.es

        correo.indexOf("@");

        String nombre = correo.substring(0,correo.indexOf("@"));
        String dominio = correo.substring(correo.indexOf("@") + 1, correo.length());

        System.out.println(nombre);
        System.out.println(dominio);
    }
}
