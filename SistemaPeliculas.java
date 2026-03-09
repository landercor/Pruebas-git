
public class SistemaPeliculas {

    Pelicula[] peliculas = new Pelicula[5];

    public void cargarPeliculas() {
        peliculas[0] = new Pelicula("Titanic", "Ciencia ficción", 1, true, true, 148, 19);
        peliculas[1] = new Pelicula("Matrix", "Acción futurista", 2, true, true, 136, 40);
        peliculas[2] = new Pelicula("Toy Story", "Animación infantil", 3, false, false, 90, 23);
        peliculas[3] = new Pelicula("Titanic", "Romance y drama", 4, true, false, 195, 56);
        peliculas[4] = new Pelicula("Avengers", "Superhéroes", 5, false, true, 143, 17);
    }

    public void contarPelis() {
        int contarPelis = 0;

        for (Pelicula pL : peliculas) {
            if (pL != null && pL.visto) {
                contarPelis++;
            }
        }

        System.out.println("Películas vistas: " + contarPelis);
    }

    public void mostrarInfop() {
        System.out.println("Todas las peliculas");
        for (Pelicula p : peliculas) {
            p.mostrarInfop();
        }
    }

    public void edad(int edad) {
        if (edad >= 18) {
            System.out.println("El usuer es mayor de edad:");
        } else {
            System.out.println("El user no es mayor de edad:");
        }
    }

    public void buscarPeliculas(String nombreBuscar) {

        for (Pelicula pI : peliculas) {

            if (pI != null && pI.nombre.equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Pelicula encontrada");
                pI.mostrarInfop();
                return;
            }
        }
        System.out.println("Peliculas no encontrada");
    }

    /*
    public boolean contarPeliculasParaAdultos() {
        if (esParaAdulto && edad < 18) {
            return false;
        }
        return esParaAdulto;
    }*/
}
