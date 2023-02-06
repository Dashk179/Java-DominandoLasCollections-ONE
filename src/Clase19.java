import model.Alumno;
import model.Curso;

import java.util.Optional;

public class Clase19 {
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

        //Al implementar el map es proceso es mas rapido, ya que por naturaleza el valor contiene una llave unica.
        //Y no hay ncesidad de crear un opcional apartir de un stream.
        Alumno alumnoMap = curso1.getAlumnoMap().get("003");

        //Existen mas tipos de map : LinkedHasMap: cada vez que nosotros hacemos un put(add)
        //Pero utilizando elLinkedHasMap lo adicionamos en orden.

        //Buscar valores de un mapa a través de un key termina siendo mucho más rápido que un List o Set.
        //El usar mapas es muy útil cuando tenemos registros únicos en nuestros registros como DNI, numero de celular, etc.
        // Porque así podemos diferenciar nuestros valores y colocarlos como llave única en nuestros registros.
      curso1.getAlumnoMap().forEach((no_coltrol,alumno) ->{
            System.out.println(no_coltrol+alumno);
        });


      //  System.out.println(alumnoMap.getNombre());

        }
    }

