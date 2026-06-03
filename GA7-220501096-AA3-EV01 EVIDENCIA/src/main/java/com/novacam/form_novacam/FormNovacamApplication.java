package com.novacam.form_novacam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación FORM_NOVACAM.
 *
 * Desde aquí se inicia todo el proyecto Spring Boot.
 * Esta clase se encarga de cargar la configuración,
 * establecer la conexión con la base de datos y
 * poner en funcionamiento todos los componentes
 * del sistema como Controllers, Services y Repositories.
 */
@SpringBootApplication
public class FormNovacamApplication {

    /**
     * Método principal que inicia la ejecución de la aplicación.
     *
     * @param args argumentos enviados al iniciar el programa.
     */
    public static void main(String[] args) {

        // Inicia el proyecto Spring Boot y carga todos sus componentes.
        SpringApplication.run(FormNovacamApplication.class, args);

    }

}
