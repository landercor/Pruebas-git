
public static void main(String[] args) {
int[] edades = {12, 18, 25, 9, 40};
int mayores = 0;

    for (int i = 0; i < edades.length; i++) {
        if (edades[i] >= 18) {
            mayores++;
        }
    }
    System.out.println("Mayores: " + mayores);
}
