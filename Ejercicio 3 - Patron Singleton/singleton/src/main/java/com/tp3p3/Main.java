package com.tp3p3;
import com.tp3p3.MODELO.Logger;

/**
 * Clase principal que simula múltiples procesos escribiendo en un archivo de log.
 * Cada hilo representará un proceso que utiliza la clase Logger para registrar mensajes
 * de error, advertencia e información.
 */
public class Main {
    
    /**
     * Método principal que simula la ejecución de múltiples procesos que escriben en el log.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear varios hilos que simulan procesos que escriben en el log
        Thread process1 = new Thread(() -> {
            Logger logger = Logger.obtenerInstancia();
            logger.info("Proceso 1: Iniciando el proceso");
            logger.advertir("Proceso 1: Advertencia durante el proceso");
            logger.error("Proceso 1: Error crítico en el proceso");
        });
        
        Thread process2 = new Thread(() -> {
            Logger logger = Logger.obtenerInstancia();
            logger.info("Proceso 2: Iniciando el proceso");
            logger.advertir("Proceso 2: Advertencia durante el proceso");
            logger.error("Proceso 2: Error crítico en el proceso");
        });
        
        Thread process3 = new Thread(() -> {
            Logger logger = Logger.obtenerInstancia();
            logger.info("Proceso 3: Iniciando el proceso");
            logger.advertir("Proceso 3: Advertencia durante el proceso");
            logger.error("Proceso 3: Error crítico en el proceso");
        });
        
        // Iniciar los hilos
        process1.start();
        process2.start();
        process3.start();
        
        // Esperar que los hilos terminen
        try {
            process1.join();
            process2.join();
            process3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
