
public static void main(String[] args) {
    int numero = -1;

    while (numero < 0 || numero > 10) {
        System.out.println("Ingrese un número entre 0 y 10:");
        numero = scanner.nextInt();
    }
}
