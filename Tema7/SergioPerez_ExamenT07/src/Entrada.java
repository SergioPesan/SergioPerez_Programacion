public class Entrada {
    public static void main(String[] args) {

        Restaurante<Restaurante.PedidoComida> restaurante1 = new Restaurante<>("Restaurante Paco");
        restaurante1.registrarPedido(restaurante1.new PedidoComida(10,3,TipoComida.Menu));
        restaurante1.registrarPedido(restaurante1.new PedidoComida(3,1,TipoComida.Bocadillo));

        Restaurante<Restaurante.ConsumicionBarra> restaurante2 = new Restaurante<>("Bar Asier");
        restaurante2.registrarPedido(restaurante2.new ConsumicionBarra(2,3,TipoBebida.Cervaza));
        restaurante2.registrarPedido(restaurante2.new ConsumicionBarra(6,4,TipoBebida.Copa));


        restaurante1.verPedidos();
        restaurante2.verPedidos();


        Restaurante restaurante3 = new Restaurante("Restaurante Manu");
        restaurante3.registrarPedido(restaurante3.new PedidoComida(5,2,TipoComida.Raciones));
        restaurante3.registrarPedido(restaurante3.new ConsumicionBarra(1,4,TipoBebida.Refresco));


    }
}
