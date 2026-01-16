package es.fplumara.dam1.actividades.alumnos;
import java.util.Objects;
public class Alumno {
    private final String dni;
    private final String nombre;

    // Limpia el DNI (quita espacios y pone mayúsculas)
    private String dniNorm(){
        return dni== null ? null : dni.trim().toUpperCase();
    }


    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nombre='" + nombre + "'}";
    }

    // DEFINIR CUANDO DOS ALUMNOS SON IGUALES CON EQUALS

}
