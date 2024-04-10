package controllers;


import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Post;
import service.PostService;

/**
 * Controlador que maneja las solicitudes HTTP relacionadas con la API de Twitter.
 */
@Path("/twitter")
public class APIController {

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

    /**
     * Obtiene el índice HTML.
     * @return Una respuesta HTTP que contiene el índice HTML.
     * @throws IOException Si ocurre un error al leer el archivo HTML.
     */
    @GET()
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public Response getIndex() throws IOException {
        return Response.ok(Files.readAllBytes(java.nio.file.Path.of("./src/main/resources/public/index.html"))).build();
    }

    /**
     * Obtiene la página de inicio de sesión HTML.
     * @return Una respuesta HTTP que contiene la página de inicio de sesión HTML.
     * @throws IOException Si ocurre un error al leer el archivo HTML.
     */
    @GET()
    @Path("login")
    @Produces(MediaType.TEXT_HTML)
    public Response getlogin() throws IOException {
        return Response.ok(Files.readAllBytes(java.nio.file.Path.of("./src/main/resources/public/login.html"))).build();
    }

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
