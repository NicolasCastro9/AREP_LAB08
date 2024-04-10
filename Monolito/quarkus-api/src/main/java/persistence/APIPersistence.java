package persistence;

import jakarta.enterprise.context.ApplicationScoped;
import model.Post;

import java.util.HashMap;
import java.util.Optional;

/**
 * Clase que proporciona persistencia para la API.
 */
@ApplicationScoped
public class APIPersistence {

    private HashMap<String, Post> APIPosts = new HashMap<>();
    private int numberOfPosts = 1;
    /**
     * Obtiene todos los posts almacenados en la API.
     * @return Un mapa que contiene todos los posts almacenados en la API.
     */
    public HashMap<String, Post> getAPIPosts() {
        return APIPosts;
    }
    /**
     * Obtiene un post específico según su identificador.
     * @param id El identificador del post.
     * @return Un objeto Optional que contiene el post si se encuentra, o vacío si no.
     */
    public Optional<Post> getPost(String id){
        return Optional.of(APIPosts.getOrDefault(id, null));
    }
    /**
     * Agrega un nuevo post a la API.
     * @param content El contenido del post.
     * @param username El nombre de usuario asociado al post.
     * @return El post que se agregó.
     */
    public Post addPost(String content, String username){
        Post newPost = new Post(numberOfPosts, content, username);
        numberOfPosts++;
        APIPosts.put(newPost.getId(), newPost);
        return newPost;
    }
}
