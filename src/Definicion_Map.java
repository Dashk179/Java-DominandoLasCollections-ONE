import model.Alumno;
import model.Curso;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Definicion_Map {
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


        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "003".equalsIgnoreCase(a.getNo_Control())).findFirst();
        if (alumno.isPresent()){
            System.out.println(alumno.get());
        }
        //Al implementar el map es proceso es mas rapido, ya que por naturaleza el valor contiene una llave unica.
        //Y no hay ncesidad de crear un opcional apartir de un stream.
        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        System.out.println(alumnoMap.getNombre());
        }
    }

