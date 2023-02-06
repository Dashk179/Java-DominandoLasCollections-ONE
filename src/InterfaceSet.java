import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterfaceSet {
    public static void main(String[] args) {
        String alumno1 ="Luis Miguel";
        String alumno2 ="Juan Carlos";
        String alumno3 ="Pedro Perez";
        String alumno4 ="Gustavo Sanchez";
        String alumno5 ="Pedro Gonzales";
        String alumno6 ="Marcia Maria";

        //Un set no tiene un orden él almacena en un círculo o sea ya no existe una position específica.
        Set<String> listaAlumnos  = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for (String alumno:listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
