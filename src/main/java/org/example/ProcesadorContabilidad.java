package org.example;

import java.io.IOException;
import java.util.List;

public class ProcesadorContabilidad implements Runnable {
    private String archivo;

    public ProcesadorContabilidad(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void run() {
        try {
            List<String> transacciones = UtilidadesFicheros.leerArchivo(archivo);
            long suma = UtilidadesFicheros.obtenerSumaTransacciones(transacciones);
            UtilidadesFicheros.escribirArchivo(archivo + ".res", String.valueOf(suma));
        } catch (IOException e) {
            System.err.println("Error procesando el archivo: " + archivo);
            e.printStackTrace();
        }
    }
}


