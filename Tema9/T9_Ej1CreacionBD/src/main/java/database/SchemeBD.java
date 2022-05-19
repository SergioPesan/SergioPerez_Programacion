package database;

public interface SchemeBD {
    String HOST = "127.0.0.1:3306";
    String DTBS = "usuariost9";
    String USER = "root";
    String PASS = "ADMIN";


    String TAB_USER = "usuario";
    String TAB_PERFIL = "perfiles";
    String COL_ID = "id";
    String COL_NOMBRE = "nombre";
    String COL_APELLIDO = "apellido";
    String COL_TELEFONO = "telefono";
    String COL_PAIS = "pais";
    String COL_SUELDO = "sueldo";
    String COL_FK_ID = "perfil";

}
