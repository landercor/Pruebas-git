
Persona p = new Persona();
Scanner scanner = new Scanner(System.in);

do {
    System.out.println("Ingrese nombre:");
    p.nombre = scanner.nextLine();

    System.out.println("Ingrese edad:");
    p.edad = scanner.nextInt();
    scanner.nextLine();

} while (!p.datosValidos());

p.mostrarResumen();
import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre:");
            p.nombre = scanner.nextLine();

            System.out.println("Ingrese edad:");
            p.edad = scanner.nextInt();
            scanner.nextLine();

        } while (!p.datosValidos());

        p.mostrarResumen();
    }
}
