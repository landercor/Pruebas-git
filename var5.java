
public static void main(String[] args) {
    int i = 1;
    int contador = 0;
    while (i <= 10) {
        
        if (i % 2 == 0) {
            System.out.println("numero par: " + i);
            contador++;
        }
        i++;
    }
    System.out.println("La cantidad de numeros pares es: " + contador);
}
