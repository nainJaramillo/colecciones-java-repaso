package es.fplumara.dam1.actividades.supermercado;

import javax.lang.model.util.ElementScanner6;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actividad {

    public void procesarEscaneos(List<String> escaneos) {

        Set<String> conjuntoEscaneos= new HashSet<>();
        int totalRepetidos = 0;
        for (String escaneo : escaneos){
            String escaneoFormateado= escaneo.trim().toLowerCase();
            System.out.println(escaneo + " -> "+ escaneoFormateado);

            if (conjuntoEscaneos.add(escaneoFormateado)){
                System.out.println("AÑADIDO: "+ escaneoFormateado);
            }else{
                System.out.println("REPETIDO: "+ escaneoFormateado);
                totalRepetidos++;
            }
        }

        System.out.printf("Total Escaneos: %d\n", escaneos.size());
        System.out.printf("Total escaneos repetidos: %d\n", totalRepetidos);
        System.out.printf("Total de productos distintos: %d\n", conjuntoEscaneos.size());
        System.out.println("Listado final de productos:");
        conjuntoEscaneos.forEach(escaneo-> System.out.println("  - " + escaneo));


    }

}
