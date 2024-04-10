package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Post;
import persistence.APIPersistence;

import java.util.HashMap;
import java.util.Optional;

/**
 * Servicio que proporciona métodos para manejar posts en la API.
 */
@ApplicationScoped
public class PostService {

    @Inject
    APIPersistence posts;
    /**
     * Obtiene todos los posts almacenados en la API.
     * @return Un mapa que contiene todos los posts almacenados en la API.
     */
    public HashMap<String, Post> getAllPosts(){
        return posts.getAPIPosts();
    }
    /**
     * Agrega un nuevo post a la API si el contenido no excede los 140 caracteres.
     * @param content El contenido del post.
     * @param username El nombre de usuario asociado al post.
     * @return Un objeto Optional que contiene el post agregado si tiene éxito, o vacío si el contenido excede los 140 caracteres.
     */
    public Optional<Post> addPost(String content, String username){
        if (content.length() <= 140){
            return Optional.of(posts.addPost(content, username));
        }
        return Optional.empty();
    }
}