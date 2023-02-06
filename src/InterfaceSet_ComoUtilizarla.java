import java.util.HashSet;
import java.util.Set;

public class InterfaceSet_ComoUtilizarla {
    public static void main(String[] args) {
        String alumno1 ="Luis Miguel";
        String alumno2 ="Juan Carlos";
        String alumno3 ="Pedro Perez";
        String alumno4 ="Gustavo Sanchez";
        String alumno5 ="Pedro Gonzales";
        String alumno6 ="Marcia Maria";
        String alumno7 ="Juan Carlos";
        String alumno8 = "Pedro Perez";

        //Un set no tiene un orden él almacena dentro de un círculo o sea ya no existe una position específica.
        //Un set no puede almacenar datos duplicados
        //Un set no puede consultar un dato ya que los datos almacenados no tienen position. si se puede buscar pero no obtener su posicion
        //Estara en nuestro criterio de acuerdo a la situacion cual interfaz ocupar de la clase Collections por lo cual una buena practica es
        // Declarar el objeto como Collections y de ahi implementar sus diferentes interfaces.
        Set<String> listaAlumnos  = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        for (String alumno:listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
