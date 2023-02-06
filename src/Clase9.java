import model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Clase9 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia",30);
        Curso curso2 = new Curso("Algebra",50);
        Curso curso3 = new Curso("Aritmetica",20);
        Curso curso4= new Curso("Geometria",10);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);

        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());

        int tiempo=0;
        //Sumar todo el tiempo metodo convencional
        for (Curso curso: cursos) {
            tiempo += curso.getTiempo();
        }
        System.out.println(tiempo);

        List<Curso> IngorandoUnObjeto = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("JavaScript")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        //Sumar todo el tiempo con stream
      System.out.println(cursos.stream().mapToInt(Curso:: getTiempo).sum());


        //Obtener el tiempo maximo de la lista y que me lo convierta en un int metodo convencional
        int mayor=0;
        for (Curso curso: cursos) {
            if (   curso.getTiempo() > mayor){
                mayor = curso.getTiempo();
            }
        }
        System.out.println(mayor);
      //Obtener el tiempo maximo de la lista y que me lo convierta en un int metodo co stream
        System.out.println(cursos.stream().mapToInt(Curso:: getTiempo).max().getAsInt());

        //Obtener la suma de toda la lista exceptuando el tiempo del curso de "Historia"
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
    }
};