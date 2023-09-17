package org.example;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Lanzador {

    private static final String[] ARCHIVOS = {"informatica.txt", "gerencia.txt", "contabilidad.txt", "comercio.txt", "recursos_humanos.txt"};

    public void ejecutar() {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (String archivo : ARCHIVOS) {
            Runnable worker = new ProcesadorContabilidad(archivo);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) { }

        long sumaTotal = Arrays.stream(ARCHIVOS)
                .mapToLong(archivo -> {
                    try {
                        List<String> resultados = UtilidadesFicheros.leerArchivo(archivo + ".res");
                        return Long.parseLong(resultados.get(0));
                    } catch (IOException e) {
                        System.err.println("Error leyendo el archivo de resultados: " + archivo + ".res");
                        return 0L;
                    }
                })
                .sum();

        try {
            UtilidadesFicheros.escribirArchivo("Resultado_global.txt", String.valueOf(sumaTotal));
        } catch (IOException e) {
            System.err.println("Error escribiendo el resultado global.");
            e.printStackTrace();
        }
    }
}



