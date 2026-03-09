
public static void main(String[] args) {
    int i = 1;
    int SMultiplos = 0;

    while (i <= 20) {
        if (i % 2 == 0) {
            SMultiplos += i;
        }
        i++;
    }
    System.out.println("la suma de lso SMultiplos de 2 es: " + SMultiplos);
}
