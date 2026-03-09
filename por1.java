
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String edad;

        do {
            System.out.println("Ingrese su edad: ");
            edad = scanner.nextInt();
        } while (edad.length() < 2);

        System.out.println("Edad ingresada: " + edad);
        scanner.close();
    }
}
