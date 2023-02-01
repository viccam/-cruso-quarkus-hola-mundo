package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.lang.annotation.Documented;
import java.util.logging.Logger;

/**
 * @author Victor Camacho
 */
@QuarkusMain
public class CustomMain {

    static Logger logger = Logger.getLogger(CustomMain.class.getName());
    public static void main(String[] args) {

        //logger.info("Running main method from CustomApp");
        //Quarkus.run(args);

        Quarkus.run(CustomApp.class, args);
    }

    /**
     * Metodo para poder cargar logica de inicio al arranque de la aplicación
     */
    public static class CustomApp implements QuarkusApplication{

        @Override
        public int run(String... args) throws Exception {
            logger.info("Running main method from CustomApp");
            Quarkus.waitForExit();
            return 0;
        }
    }

}
