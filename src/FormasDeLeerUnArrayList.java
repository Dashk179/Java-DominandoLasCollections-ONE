import java.util.ArrayList;

public class FormasDeLeerUnArrayList {
    public static void main(String[] args) {

        String variable1 = "clase 1";
        String variable2 ="clase 2";
        String variable3 ="clase 3";
        String variable4 ="clase 4";

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add(variable1);
        listaString.add(variable4);
        listaString.add(variable2);
        listaString.add(variable3);

        System.out.println(listaString);

//        for (int i = 0; i < listaString.size(); i++) {
//            System.out.println(listaString.get(i));
//        }

//        for (String clase : listaString) {
//            System.out.println(clase);
//        }
        listaString.forEach(clase -> System.out.println(clase));
    }
}
