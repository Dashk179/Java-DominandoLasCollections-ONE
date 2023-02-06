package model;

public class Alumno {
    private String  nombre;
    private String no_Control;

    public Alumno(String nombre, String no_Control) {
        this.nombre = nombre;
        this.no_Control = no_Control;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNo_Control() {
        return no_Control;
    }

    @Override
    public String toString() {
        return( this.nombre );

    }

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
}
