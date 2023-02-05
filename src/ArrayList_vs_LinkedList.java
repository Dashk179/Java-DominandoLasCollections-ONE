import model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_vs_LinkedList {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        for (List<Integer> lista: listas){
            final String nombreImplementacion = lista.getClass().getSimpleName();
            //add
            long inico = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                lista.add(i);
            }
            long fin = System.currentTimeMillis();
            long duracion = fin - inico;
            System.out.println(nombreImplementacion + " add: "+ duracion);

            // get
            inico = System.currentTimeMillis();
            for (int i = 0; i <100000; i++) {
                lista.get(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inico;
            System.out.println(nombreImplementacion + " get: "+ duracion);

            inico = System.currentTimeMillis();
            for (int i = 99999; i >= 0; i--) {
                lista.remove(i);
            }
            fin = System.currentTimeMillis();
            duracion = fin - inico;
            System.out.println(nombreImplementacion + " remove: "+ duracion);
        }
    }
};