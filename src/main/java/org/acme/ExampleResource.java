package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.logging.Level;
import java.util.logging.Logger;

@Path("/hello")
public class ExampleResource {

    static Logger logger = Logger.getLogger(ExampleResource.class.getName());


    @ConfigProperty(name="greeting")
    private String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("custom/{name}")
    public String customHello(@PathParam("name") String name) {

        logger.log(Level.INFO, "logging: {0} {1}", new Object[] { "greeting", "Quarkus" });
        logger.log(Level.INFO, "logging: {0} {1}", new Object[] { name, greeting });
        return greeting +" " +  name +"  welcome";
    }


}