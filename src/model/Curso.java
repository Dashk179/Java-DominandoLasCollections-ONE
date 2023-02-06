package model;

import java.util.*;

public class Curso  {
    private String  nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo,List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList); //Para que no sea modificada nuestra lista agregamos esta linea.
        //Entonces estos nos obliga a utilizar nuestra clase encapsulada. -> addAula()
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public void addAula(Aula aula){
        this.aulaList.add(aula);
    } //Clase encapsulada

    public void addAlumno(Alumno alumno){this.alumnos.add(alumno);}

    public boolean verificaAlumno(Alumno alumno){return this.alumnos.contains(alumno);}

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    @Override
    public String toString() {
        return("Nombre: "  + this.nombre +" || "+" Duracion en hrs : " + this.tiempo +" || ");
    }



}
