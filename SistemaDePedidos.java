
public class SistemaDePedidos {

    Pedido[] pedidos = new Pedido[4];

    public void cargarPedidos() {
        pedidos[0] = new Pedido(1, false, true, 100.3, 20);
        pedidos[1] = new Pedido(2, true, false, 100.54, 20);
        pedidos[2] = new Pedido(3, true, true, 100.45, 20);
        pedidos[3] = new Pedido(4, true, false, 100.90, 20);
    }

    public void mostrarPedidosEntregables() {
        System.out.println("Pedidos que puedan entregarse");
        for (Pedido p : pedidos) {
            if (p != null && p.id && !p.entregado) {
                p.mostrarInfPedidos();
            }
        }
    }
}
