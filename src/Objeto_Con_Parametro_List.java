import model.Aula;
import model.Curso;

import java.util.ArrayList;

public class Objeto_Con_Parametro_List {
    public static void main(String[] args) {
        //La ventaja de declarar un objeto List como parametro desde nuestra clase es que podemos
        //Ocupar las implementacines de List aunque no las declaremos al crear el objeto
        // ya que por natulareza del objeto recibe un parametro y lo manda a una lista
        //Esa lista fue creeada apartir de java.util.List (Interfaz)
        //Por lo cual desde la clase "Curso" podemos convertir nuestra lista
        //a sus diferentes implementaciones -> ArrayList, List, LinkedList
        Curso curso1 = new Curso("JavaScript",30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());
    }
}
