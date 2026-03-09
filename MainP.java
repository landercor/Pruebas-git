
public class MainP {

    public static void main(String[] args) {

        SistemaPeliculas sistema = new SistemaPeliculas();

        sistema.cargarPeliculas();
        sistema.mostrarInfop();

        System.out.println("-----------------------");

        sistema.contarPelis();

        System.out.println("-----------------------");

        sistema.buscarPeliculas("Matrix");

        System.out.println("-----------------------");

    }
}
