import model.Alumno;

import java.util.*;

public class Porque_Usar_Equal_O_HashCode {
    public static void main(String[] args) {
        Alumno alumno1 =  new Alumno("Luis Miguel","001");
        Alumno alumno2 =new Alumno("Juan Carlos","002");
        Alumno alumno3 =new Alumno("Pedro Perez","003");
        Alumno alumno4 =new Alumno("Gustavo Sanchez","004");
        Alumno alumno5 =new Alumno("Pedro Gonzales","005");
        Alumno alumno6 =new Alumno("Marcia Maria","006");


        Collection<Alumno> listaAlumnos  = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        //Cuando utilices el metodo equals en una interfaz Hash es importante sobreescribir el methods hashCode() en nuestra clase
        //para que cree un codigo hash en el elemento para identificar los elementos que queremos comprar.
        //Es importante saber sobre que porametro estamos implementando el metod hashCode() para este ejemplo se utilizo el parametro nombre.
        Alumno alumnoNuevo = new Alumno("Luis Miguel","001");
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));

        }
    }

