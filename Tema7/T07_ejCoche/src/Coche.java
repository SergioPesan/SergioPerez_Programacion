public class Coche {

    //atributos
    private double precio;
    private int velocidad;
    private String marca, modelo;
    private Motor motor;

    //costructores
    public  Coche(){}

    public Coche(int precio, String marca, String modelo, int velocidad) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //Métodos
    public void mostrarDatos(){
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);

        if (motor != null){
            motor.mostrarDatos();
        }else{
            System.out.println("El coche aún no tiene motor");
        }
    }


    //Getter y Setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    //Clase anidada
    class Motor{
        //atributos
        int cv, cc;

        //constructores
        public Motor(){
            setMotor(this);
        }
        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        //Métodos
        public void mostrarDatos(){
            System.out.println("CV: " + cv);
            System.out.println("CC: " + cc);
        }

        public void revalorizarCoche(){
            if (cv >= 0 && cv < 50){
                precio = precio * 1.25;
            }else if (cv >= 50 && cv < 100){
                precio = precio * 1.4;
            }else if (cv >= 100 && cv <= 200){
                precio = precio * 1.6;
            }else if(cv > 200){
                precio = precio * 1.8;
            }else{
                System.out.println("No es posible tener ese número de CV");
            }
        }

        //Getter y Setter
        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }
    }


}
