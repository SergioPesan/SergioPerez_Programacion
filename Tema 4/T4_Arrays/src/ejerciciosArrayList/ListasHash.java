package ejerciciosArrayList;

import java.util.Enumeration;
import java.util.Hashtable;

public class ListasHash {
    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        //para sacar el tamaño de la lista (es igual a la ArrayList).
        listaElementos.size();
        //guardar cosas en un HashTable
        listaElementos.put("1","Elemento 1");
        listaElementos.put("2","Elemnto 2");
        listaElementos.put("3",false);
        listaElementos.put("4",new String[]{"cosa 1", "cosa 2", "cosa 3"});

        //System.out.println(listaElementos.size());

        //obtener elementos del HashTable
        //String[] elementoEncontrado = (String[]) listaElementos.get("4");

        //elementoEncontrado[0] = "nuevo valor";

        /*for (String item: elementoEncontrado) {
            System.out.println(item);
        }*/

        //borrar un elemento
        //listaElementos.remove("1");
        //System.out.println(listaElementos.get("1"));

        System.out.println("Listado completo");

        Enumeration<Object> listaClaves = listaElementos.keys();
        while (listaClaves.hasMoreElements()){
            //hay elemento siguiente
            Object clave = listaClaves.nextElement();
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);

        }





   }
}
