package ejerciciosBase;

import java.util.Scanner;

public class Persona {
    Scanner entradaTeclado = new Scanner(System.in);

    //Variables
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //Constructor
    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona(String nombre, String apellido,String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "111111X";
    }


    //Getter
    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDni() { return dni; }

    public int getEdad() { return edad; }

    public int getAltura() { return altura; }

    public double getPeso() { return peso; }

    //Setter
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public void setDni(String dni) { this.dni = dni; }

    public void setEdad(int edad) { this.edad = edad; }

    public void setAltura(int altura) { this.altura = altura; }

    public void setPeso(double peso) { this.peso = peso; }

    //Mostrar todos los datos de una persona
    public void mostrarDatos(){
        /*System.out.println("Introduce el nombre: ");
        nombre = entradaTeclado.next();
        System.out.println("Introduce el apellido: ");
        apellido = entradaTeclado.next();
        System.out.println("Introduce el dni: ");
        dni = entradaTeclado.next();
        System.out.println("Introduce la edad: ");
        edad = entradaTeclado.nextInt();
        System.out.println("Introduce el peso: ");
        peso = entradaTeclado.nextDouble();
        System.out.println("Introduce la altura: ");
        altura = entradaTeclado.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("dni: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);*/

        System.out.printf("Nombre: %s%nApellido: %s%nDNI: %s%nEdad %d",nombre,apellido,dni,edad);


    }

}
