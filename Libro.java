
public class Libro {

    public final String titulo;
    public final String autor;
    public boolean leido;
    public int paginas;

    public Libro(String titulo, String autor, int par) {
        this.titulo = titulo;
        this.autor = autor;
        this.leido = false;
        this.paginas = 0;
    }

    // Método que antes aparecía como "never used"
    public void MostrarInfo() {
        System.out.printf("Título: %s%nAutor: %s%nLeído: %s%nPaginas: %s%n", titulo, autor, leido ? "sí" : "no", paginas);
    }

    // Método que antes aparecía como "never used"
    public void marcaComoLeido() {
        this.leido = true;
    }

    // Pequeño ejemplo de uso para evitar advertencias de "never used"
    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        libro.MostrarInfo();
        libro.marcaComoLeido();
        libro.MostrarInfo();
        libro.paginas = 417;
        libro.MostrarInfo();
    }
}
