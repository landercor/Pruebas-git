
public class Pedido {

    int id;
    boolean entregado;
    int timePrepa;
    int distanciaKm;

    public Pedido(int id, int total, boolean pagado, boolean entregado, int timePrepa, int distanciaKm
    ) {
        this.id = id;
        this.entregado = false;
        this.timePrepa = timePrepa;
        this.distanciaKm = distanciaKm;

    }

    public void mostrarInfEstados() {
        System.out.print("Pedido " + id);
        System.out.println("Entregado " + entregado);
        System.out.println("Tiempo estimado: " + timePrepa);
        System.out.println("Distancia: " + distanciaKm);
        System.out.println("--------------");
    }

    public int calcularTime() {

        int velocidadPromedio = 40;

        double minPorKm = 60.0 / velocidadPromedio;

        int tiempoTotal = timePrepa + (int) (distanciaKm * minPorKm);

        return tiempoTotal;
    }

    public void mostrarInfPedidos() {
        System.out.printf(
                "Id: %s%nentregado: %s%ntimePrepa: %s%ndistanciaKm: %s%n",
                id,
                entregado ? "si" : "no", entregado,
                timePrepa,
                distanciaKm
        );
    }
}
