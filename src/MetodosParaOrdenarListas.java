import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MetodosParaOrdenarListas {
    public static void main(String[] args) {
        String curso1 ="Geometria";
        String curso2 ="Fisica";
        String curso3 ="Quimica";
        String curso4 ="Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso4);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);

        //Ordenar la lista con la clase Collections

//        System.out.println(cursos);
//
//        Collections.sort(cursos);//Ordenamos la lista de forma acendente
//          System.out.println(cursos);
//
//        Collections.sort(cursos,Collections.reverseOrder());//Ordenar la lista de forma decendente
//        System.out.println(cursos);

        //Ordenar la lista con la implementaciion ArrayList
//        cursos.sort(Comparator.reverseOrder());
//        System.out.println(cursos);
//        cursos.sort(Comparator.naturalOrder());
//        System.out.println(cursos);
//
            //Ordenar con Streams
        List<String> cursoListaStream = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursoListaStream);
    }
}
