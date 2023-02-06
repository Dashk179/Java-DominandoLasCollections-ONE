import model.Alumno;
import model.Curso;

import java.util.Collection;
import java.util.HashSet;

public class Clase15 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria",30);

        Alumno alumno1 =  new Alumno("Luis Miguel","001");
        Alumno alumno2 =new Alumno("Juan Carlos","002");
        Alumno alumno3 =new Alumno("Pedro Perez","003");
        Alumno alumno4 =new Alumno("Gustavo Sanchez","004");
        Alumno alumno5 =new Alumno("Pedro Gonzales","005");
        Alumno alumno6 =new Alumno("Marcia Maria","006");
    //Ahora se aplica lo logica a nivel de clase para agregar todos los metodos en la clase.
        // y solamente implementarlos y no crearlos.
        //Y asi hacer un sistema mas escalable y que de igual manera implemente buenas prácticas.
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        Alumno alumnoNuevo = new Alumno("Luis Miguel","001");
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(curso1.getAlumnos().contains(alumnoNuevo));


        }
    }

