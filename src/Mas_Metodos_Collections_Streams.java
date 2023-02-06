import model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Mas_Metodos_Collections_Streams {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia",30);
        Curso curso2 = new Curso("Algebra",10);
        Curso curso3 = new Curso("Aritmetica",20);
        Curso curso4= new Curso("Geometria",50);
        Curso curso5 = new Curso("Fisica",60);
        Curso curso6 = new Curso("Quimica",80);
        Curso curso7 = new Curso("Geografia",70);
        Curso curso8 = new Curso("Educacion Fisica",30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        //System.out.println(cursos);

        List<Curso> IngorandoUnObjeto = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("JavaScript")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        //Obtener la suma de toda la lista exceptuando el tiempo del curso de "Historia"
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());

        //El promedio del contenido de la lista
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());

        //El numero maximo dentro de la lista
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());

        //El numero minimo dentro de la lista
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());

        Map<String, List<Curso>> grupoCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));

        //Metodo para saber si un valor esta repetido dentro de la lista
        grupoCurso.forEach((key,value) -> System.out.println(key + " -  " + value.size()));

        //Hacer un group by de una lista usando el método groupingBy de la clase Collectors.
        System.out.println(cursos.parallelStream().mapToInt(Curso:: getTiempo).sum());


    }
};