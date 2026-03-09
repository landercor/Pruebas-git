
import java.util.Scanner;


public static void main(String[] args ) {
    int entero = 0;
    Scanner scanner = new Scanner(System.in);

    while (entero <= 0) {
        System.out.print("Ingrese un numero positivo: ");
        entero= scanner.nextInt();

    scanner.close();
    }
}
