package controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.PostService;

/**
 * Controlador que maneja las solicitudes relacionadas con los threads en la API.
 */
@Path("/service/thread")
public class ThreadController {


    @Inject
    PostService postService;
    
    /**
     * Obtiene todos los posts.
     * @return Una respuesta HTTP que contiene todos los posts en formato JSON.
     */
    @GET()
    @Path("all-posts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok(postService.getAllPosts()).build();
    }
}