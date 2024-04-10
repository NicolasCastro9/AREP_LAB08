package controllers;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


/**
 * Controlador que maneja las solicitudes relacionadas con los usuarios en la API.
 */
@Path("/service/user")
public class UserController {

    /**
     * Obtiene todos los usuarios válidos.
     * @return Una respuesta HTTP que indica que todos los usuarios son válidos.
     */
    @GET()
    @Path("all-valid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok("Es valido").build();
    }
    
}
