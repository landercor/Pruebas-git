
public void contarPeliculasParaAdultos() {
        int contador = 0;

        for (Pelicula p : peliculas) {
            if (p.esParaAdultos) {
                contador++;
            }
        }

        System.out.println("Películas solo para adultos: " + contador);
    }
}
