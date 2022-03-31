import java.io.IOException;
import java.util.ArrayList;

public class Restaurante<T> {

    // atributos

    private String nombre;
    private int numComensalesTotales, caja;
    private ArrayList<T> listaPedidos;

    // constructores


    public Restaurante(String nombre) {
        this.nombre = nombre;
        listaPedidos = new ArrayList();
    }

    public Restaurante() {
    }

    // métodos
    public void colocarComensales(T numero){
        if (numComensalesTotales <= 50){
            numComensalesTotales += (int)numero;
            System.out.println("Comensales colocados con éxito");
        }else{
            LanzarEx lanzarEx = new LanzarEx();
            try{
                lanzarEx.lanzarMiExcepcion();
            }catch (MiExcepcion miExcepcion){
                System.out.println(miExcepcion.getMessage());
            }
        }
    }

    public void registrarPedido(T pedido){
        listaPedidos.add(pedido);
    }

    public void verPedidos(){
        for ( T item : listaPedidos ) {
            ((Restaurante.PedidoComida)item).calcularPrecioReal();
            ((Restaurante.ConsumicionBarra)item).cacularPrecioReal();
        }
    }


    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumComensalesTotales() {
        return numComensalesTotales;
    }

    public void setNumComensalesTotales(int numComensalesTotales) {
        this.numComensalesTotales = numComensalesTotales;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public ArrayList getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    class PedidoComida implements Constantes{

        // atributos
        private double precio;
        private int numeroConsumiciones;
        TipoComida tipoComida;

        //constructores

        public PedidoComida() {
        }

        public PedidoComida(double precio, int numeroConsumiciones, TipoComida tipoComida) {
            this.precio = precio;
            this.numeroConsumiciones = numeroConsumiciones;
            this.tipoComida = tipoComida;
        }

        //métodos
        public void calcularPrecioReal(){
            setPrecio((this.precio + (this.precio * IVA_COMIDA)) * numeroConsumiciones);
            System.out.println(getPrecio());
        }

        public void verFactura(){
            calcularPrecioReal();
            System.out.println("Número de Consumiciones:" + numeroConsumiciones);
            System.out.println("Nombre del Restaurante: " + getNombre());
            System.out.println("CIF: " + CIF);
        }

        //getter y setter

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumeroConsumiciones() {
            return numeroConsumiciones;
        }

        public void setNumeroConsumiciones(int numeroConsumiciones) {
            this.numeroConsumiciones = numeroConsumiciones;
        }
    }

    class ConsumicionBarra implements Constantes{

        // atributos
        private double precio;
        private int numeroConsumiciones;
        TipoBebida tipoBebida;

        //constructores

        public ConsumicionBarra(double precio, int numeroConsumiciones, TipoBebida tipoBebida) {
            this.precio = precio;
            this.numeroConsumiciones = numeroConsumiciones;
            this.tipoBebida = tipoBebida;
        }

        public ConsumicionBarra() {
        }

        //metodos

        public void cacularPrecioReal(){
            setPrecio((this.precio + (this.precio * IVA_BEBIDAS)) * numeroConsumiciones);
        }

        public void verFactura(){
            cacularPrecioReal();
            System.out.println("Número de Consumiciones:" + numeroConsumiciones);
            System.out.println("Nombre del Restaurante: " + getNombre());
            System.out.println("CIF: " + CIF);
        }
        //getter y setter

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumeroConsumiciones() {
            return numeroConsumiciones;
        }

        public void setNumeroConsumiciones(int numeroConsumiciones) {
            this.numeroConsumiciones = numeroConsumiciones;
        }
    }











}
