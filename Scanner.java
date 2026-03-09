
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        Personax persona = new Personax(nombre, edad);
        persona.MostrarInfox();

        scanner.close();
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
