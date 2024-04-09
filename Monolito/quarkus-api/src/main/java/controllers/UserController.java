package controllers;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/service/user")
public class UserController {

    @GET()
    @Path("all-valid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok("Es valido").build();
    }
}
