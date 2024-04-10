package controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Post;
import service.PostService;

import java.util.Optional;

/**
 * Controlador que maneja las solicitudes relacionadas con los posts en la API.
 */
@Path("/service/post")
public class PostController {
    @Inject
    PostService postService;

    /**
     * Agrega un nuevo post.
     * @param content El contenido del post en formato JSON.
     * @return Una respuesta HTTP que contiene el post agregado en formato JSON.
     */
    @POST()
    @Path("addPost")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPost(String content) {
        Optional<Post> post = postService.addPost(content.split(",")[1], content.split(",")[0]);
        return Response.ok(post).build();
    }
}
