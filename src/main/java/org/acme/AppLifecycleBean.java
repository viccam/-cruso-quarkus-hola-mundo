package org.acme;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import java.util.logging.Logger;

/**
 * Clase de ejemplo para manejar eventos al iniciar o finalizar la aplicación
 * Tener presente al finalizarla es altr + q y con eso se ve la ejecución del envento
 * . se puede utilizar para cuando se requiere inicializar alguna logica de negocio
 */
@ApplicationScoped
public class AppLifecycleBean {

    static Logger logger = Logger.getLogger(AppLifecycleBean.class.getName());

    /**
     * Metodo para ejecutar logica de inicio de la aplicación
     * @param evt
     */
    void onStart(@Observes StartupEvent evt){
        logger.info("The application is starting ...************************************");
    }

    /**
     * metodo para ejecutar logica antes de que acabe la aplicación.
     * @param evt
     */
    void onStop(@Observes ShutdownEvent evt){
        logger.info("The application is stoping ...++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
