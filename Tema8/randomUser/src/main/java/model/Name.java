package model;

public class Name {
    private String imagen, mail;
    private Name name;

    public Name() {
    }

    public Name(String imagen, String mail, Name name) {
        this.imagen = imagen;
        this.mail = mail;
        this.name = name;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "imagen='" + imagen + '\'' +
                ", mail='" + mail + '\'' +
                ", name=" + name +
                '}';
    }
}
