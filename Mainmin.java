
public class Mainmin {

    public static void main(String[] args) {

        Usuario1[] usuarios = new Usuario1[4];

        usuarios[0] = new Usuario1("A", 20);
        usuarios[1] = new Usuario1("Luis", 15);
        usuarios[2] = new Usuario1("Marta", 30);
        usuarios[3] = new Usuario1("pedro", 25);

        for (Usuario1 uS : usuarios) {
            uS.mostrarInfo();
        }
    }

    static class Usuario1 {

        private final String nombre;
        private final int edad;

        public Usuario1(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", edad: " + edad);
        }
    }
}
