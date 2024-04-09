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

@Path("/twitter")
public class APIController {

    @Inject
    PostService postService;
    @GET()
    @Path("all-posts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts() {
        return Response.ok(postService.getAllPosts()).build();
    }

    @GET()
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public Response getIndex() throws IOException {
        return Response.ok(Files.readAllBytes(java.nio.file.Path.of("./src/main/resources/public/index.html"))).build();
    }

    @GET()
    @Path("login")
    @Produces(MediaType.TEXT_HTML)
    public Response getlogin() throws IOException {
        return Response.ok(Files.readAllBytes(java.nio.file.Path.of("./src/main/resources/public/login.html"))).build();
    }

    @POST()
    @Path("addPost")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPost(String content) {
        Optional<Post> post = postService.addPost(content.split(",")[1], content.split(",")[0]);
        return Response.ok(post).build();
    }
}
