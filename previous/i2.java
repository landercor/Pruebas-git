
public static void main(String[] args) {
    int i = 1;
    int Nmayor = 0;

    while (i <= 7) {

        int numero  = i * 3;

        if (numero > Nmayor) {
            Nmayor = numero;
        }
        i++;
    }
    System.out.println("El numero mayor es: " + Nmayor);
}
