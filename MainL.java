
public class MainL {

    public static void main(String[] args) {

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        sistema.cargarLibros();
        sistema.mostrarTodosLosLibros();

        System.out.println("----------------");

        sistema.mostrarLibrosAntiguos();

        System.out.println("----------------");

        sistema.contarLibros();
    }
}
