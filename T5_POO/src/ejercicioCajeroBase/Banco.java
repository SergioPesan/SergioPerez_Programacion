package ejercicioCajeroBase;

import java.util.ArrayList;

public class Banco {
    String nombre, cif;

    ArrayList cuentas = new ArrayList();

    public Banco(String nombre, String cif){
        this.nombre = nombre;
        this.cif = cif;
    }


}
