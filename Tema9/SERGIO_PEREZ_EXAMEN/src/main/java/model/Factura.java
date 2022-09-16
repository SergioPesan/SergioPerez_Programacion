package model;

import java.io.Serializable;

public class Factura implements Serializable {
    // atributos
    private String id, compania,pais,telefono;
    private int total;

    // constructores

    public Factura(String id, String compania, String pais, String telefono, int total) {
        this.id = id;
        this.compania = compania;
        this.pais = pais;
        this.telefono = telefono;
        this.total = total;
    }

    public Factura() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id='" + id + '\'' +
                ", compania='" + compania + '\'' +
                ", pais='" + pais + '\'' +
                ", telefono='" + telefono + '\'' +
                ", total=" + total +
                '}';
    }
}
