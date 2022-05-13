import controller.BinariosController;
import controller.EjercicioController;

public class Main {
    public static void main(String[] args) {
        BinariosController controller = new BinariosController();
        //controller.escribirBinario();
        //controller.lecturaBinario();

        EjercicioController controller1 = new EjercicioController();
        //controller1.writeBinario();
        controller1.readBinario();
    }
}
