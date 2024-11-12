package com.tp3p3.MODELO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Esta clase implementa el patrón Singleton para gestionar el sistema de logging.
 * Solo existe una instancia de la clase Logger en la aplicación, y permite registrar
 * mensajes de diferentes niveles (ERROR, WARN, INFO) en un archivo de log.
 */
public class Logger {
    
    // La única instancia de la clase Logger
    private static Logger instance = null;
    
    // Ruta del archivo de log
    private String logFile = "application.log";
    
    /**
     * Constructor privado para prevenir la creación de instancias fuera de esta clase.
     */
    private Logger() {
        // El constructor puede abrir un archivo de log o configurar parámetros si es necesario.
    }
    
    /**
     * Obtiene la instancia única de la clase Logger.
     * Si no existe, crea una nueva instancia.
     * synchronized se usa para que solo un hilo pueda acceder al metodo
     *
     * @return La instancia única de Logger.
     */
    public static synchronized Logger obtenerInstancia() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Método privado para registrar un mensaje en el archivo de log con un nivel específico.
     *
     * @param level El nivel del mensaje (ERROR, WARN, INFO).
     * @param mensaje El mensaje a registrar.
     */
    private void log(String level, String mensaje) {
        // Crear la marca de tiempo para el mensaje
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        // Mensaje a registrar
        String logMessage = String.format("[%s] [%s] %s", timestamp, level, mensaje);
        
        // Escribir en el archivo de log
        try (FileWriter fileWriter = new FileWriter(logFile, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(logMessage);  // Escribir el mensaje en el archivo
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
        
        // Imprimir el mensaje en la consola
        System.out.println(logMessage);
    }
    
    /**
     * Registra un mensaje de tipo error en el archivo de log.
     *
     * @param mensaje El mensaje de error a registrar.
     */
    public void error(String mensaje) {
        log("ERROR", mensaje);
    }
    
    /**
     * Registra un mensaje de tipo advertencia en el archivo de log.
     *
     * @param mensaje El mensaje de advertencia a registrar.
     */
    public void advertir(String mensaje) {
        log("WARN", mensaje);
    }
    
    /**
     * Registra un mensaje de tipo información en el archivo de log.
     *
     * @param mensaje El mensaje informativo a registrar.
     */
    public void info(String mensaje) {
        log("INFO", mensaje);
    }
}

