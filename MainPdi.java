
public class MainPdi {

    public static void main(String[] args) {
        SistemaDePedidos sistema = new SistemaDePedidos();

        System.out.println("----------------");

        sistema.cargarPedidos();
        sistema.mostrarPedidosEntregables();

        System.out.println("----------------");

        sistema.calcularTime();

        sistema.mostrarInfPedidos();

        System.out.println("----------------");
    }
}
