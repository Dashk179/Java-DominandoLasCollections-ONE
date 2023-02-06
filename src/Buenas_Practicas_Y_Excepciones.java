import model.Alumno;
import model.Curso;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Buenas_Practicas_Y_Excepciones {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria",30);

        Alumno alumno1 =  new Alumno("Luis Miguel","001");
        Alumno alumno2 =new Alumno("Juan Carlos","002");
        Alumno alumno3 =new Alumno("Pedro Perez","003");
        Alumno alumno4 =new Alumno("Gustavo Sanchez","004");
        Alumno alumno5 =new Alumno("Pedro Gonzales","005");
        Alumno alumno6 =new Alumno("Marcia Maria","006");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);


     Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

      while ( alumnoIterator.hasNext()){
          System.out.println(alumnoIterator.next());
      }

      //next() significa que es el ultimo elemento y como ya recorrimos todo con el while
        //nos marcara una excepcion NoSuchElementException
        try {
            alumnoIterator.next();
        } catch (NoSuchElementException e){
            System.out.println("No Existe");
        }

        }
    }

