package org.example;


import java.io.*;
import java.util.*;
import java.util.stream.*;

public class UtilidadesFicheros {

    public static List<String> leerArchivo(String ruta) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            return reader.lines().collect(Collectors.toList());
        }
    }

    public static void escribirArchivo(String ruta, String contenido) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write(contenido);
        }
    }

    public static long obtenerSumaTransacciones(List<String> transacciones) {
        return transacciones.stream()
                .mapToLong(Long::parseLong)
                .sum();
    }
}

