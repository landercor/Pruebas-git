
public class Main2 {

    public static void main(String[] args) {

        personas p2 = new personas();
        p2.nombre = "can";
        p2.edad = 5;

        p2.esMayor();
        System.out.println("-----");

        personas p3 = new personas();
        p3.nombre = "dan";
        p3.edad = 25;

        p3.esMayor();
        System.out.println("-------");

        personas p4 = new personas();
        p4.nombre = "juan";
        p4.edad = 46;
        p4.esMayor();

        p2.Presentarse();
        p3.Presentarse();
    }

}
