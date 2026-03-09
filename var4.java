
public static void main(String[] args) {
    int i = 1;
    int sumaPares = 0;
    while (i <= 10) {
        if (i % 2 == 0) {

            sumaPares += i;
            i++;
        }
        i++;
    }
    System.out.println("La suma es: " + sumaPares);
}
