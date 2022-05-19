package model;

import java.io.Serializable;

public class Personaje implements Serializable {
    // atributos
    String name, photo;

    // constructores

    public Personaje() {
    }

    public Personaje(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    // getter & setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // método toString()

}
