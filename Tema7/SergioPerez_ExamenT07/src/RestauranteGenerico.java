import java.util.ArrayList;

public class RestauranteGenerico <T extends Restaurante>{
    private ArrayList<T> listaPedidos;

    public RestauranteGenerico() {
        listaPedidos = new ArrayList<>();
    }

    public void registrarPedido(T pedido){
        listaPedidos.add(pedido);
    }
}
