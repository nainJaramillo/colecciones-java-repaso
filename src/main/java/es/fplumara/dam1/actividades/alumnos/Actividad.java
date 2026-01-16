package es.fplumara.dam1.actividades.alumnos;

import java.util.*;

public class Actividad {

    public void procesar(List<Alumno> alumnosEntrada) {
        Set<Alumno> set = new HashSet<>();
        for (Alumno a: alumnosEntrada){
            set.add(a);
        }

        System.out.println("Intentabas meter: " + alumnosEntrada.size());
        System.out.println("Quedaron en el set: " + set.size());


        }
    }