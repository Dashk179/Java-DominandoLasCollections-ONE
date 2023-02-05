import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarListaObjetos {
    public static void main(String[] args) {
        Curso curso1 = new Curso("JavaScript",30);
        Curso curso2 = new Curso("PHP",50);
        Curso curso3 = new Curso("Python",20);
        Curso curso4= new Curso("C#",10);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        cursos.forEach(curso -> System.out.print(curso));
        System.out.println("");
        //   Collections.sort(cursos);
        //Collections.sort(cursos,Comparator.comparing(model.Curso::toString));
        cursos.sort(Comparator.comparing(Curso::toString));
        cursos.forEach(curso -> System.out.print(curso));
        cursos.sort(Comparator.comparing(Curso::toString).reversed());
        System.out.println("");
        cursos.forEach(curso -> System.out.print(curso));

        //Ahora vamos a ordenar nuestra lista de objetos por tiempo
       List<Curso> listaOrdenInt = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println("");
        System.out.println(listaOrdenInt);

        //Creamos una nueva lista ignorando un objeto
        List<Curso> IngorandoUnObjeto = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("JavaScript")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println("");
        System.out.println(IngorandoUnObjeto);
    }
}
