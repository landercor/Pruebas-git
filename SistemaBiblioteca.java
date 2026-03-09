
public class SistemaBiblioteca {

    Libro[] libros = new Libro[5];

    public void cargarLibros() {
        libros[0] = new Libro("Cien Años de Soledad", "García Márquez", 1967);
        libros[1] = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        libros[2] = new Libro("Clean Code", "Robert C. Martin", 2008);
        libros[3] = new Libro("1984", "George Orwell", 1949);
        libros[4] = new Libro("Harry Potter", "J.K. Rowling", 1997);
    }

    public void mostrarTodosLosLibros() {
        System.out.println("📚 Lista de libros:");
        for (Libro libro : libros) {
            libro.MostrarInfo();
        }
    }

    public void mostrarLibrosAntiguos() {
        System.out.println("📜 Libros antiguos:");
        for (Libro libro : libros) {
            if (libro.esAntiguo()) {
                libro.mostrarInfo();
            }
        }
    }

    public void contarLibros() {
        int contador = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                contador++;
            }
        }
        System.out.println("Total de libros registrados: " + contador);
    }
}
