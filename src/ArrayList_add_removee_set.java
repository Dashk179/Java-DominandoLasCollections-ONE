import java.util.ArrayList;

public class ArrayList_add_removee_set {
    public static void main(String[] args) {
        String variable1 ="Ejemplo 1";
        String variable2 ="Ejemplo 2";
        String variable3 ="Ejemplo 3";
        String variable4 ="Ejemplo 4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable4);
        lista.add(variable2);
        lista.add(variable3);

        System.out.println(lista);

        lista.remove(2);

        System.out.println(lista);

        lista.set(2,"Ejemplo Alterado");

        System.out.println(lista);

        System.out.println("Tamano de la lista " +lista.size());

    }
}
