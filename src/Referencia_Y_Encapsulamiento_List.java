import model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.List;

public class Referencia_Y_Encapsulamiento_List {
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

        List<Aula> aulaList = curso1.getAulaList();

       // aulaList.add(new Aula("Inumtable")); <- Si esto funciona no deberia de ser asi, ya que estamos accediendo por medio de un metodo no encapsulado.
        //Por lo cual tenemos que obligar a que solo se pueda modificar por medio del metodo encapsulado el cual es "addAula"
        //Que tenemos que hacer para resolver este problema? Hacemos nuestra lista Inmutable (Lista no modificable).

        curso1.addAula(new Aula("Inmutable"));
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(aulaList);
    }
}
