import model.Curso;

import java.util.ArrayList;

public class ListasConObjetos {
    public static void main(String[] args) {
       Curso curso1 = new Curso("Geometria",30);
       Curso curso2 = new Curso("Historia",50);
       Curso curso3 = new Curso("Algebra",20);
       Curso curso4= new Curso("Fisica",10);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        cursos.forEach(curso -> System.out.println(curso));

    }
}
