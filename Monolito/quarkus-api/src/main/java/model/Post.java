package model;

/**
 * Clase que representa un post de twitter.
 */
public class Post {

    private String id;
    private String content;
    private String username;

    /**
     * Constructor para crear un nuevo post.
     * @param id El identificador del post.
     * @param content El contenido del post.
     * @param username El nombre de usuario que realizó el post.
     */
    public Post(Integer id, String content, String username) {
        this.id = String.valueOf("P"+id);
        this.content = content;
        this.username = username;
    }
    /**
     * Obtiene el identificador del post.
     * @return El identificador del post.
     */
    public String getId() {
        return id;
    }
    /**
     * Establece el identificador del post.
     * @param id El identificador del post.
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Obtiene el contenido del post.
     * @return El contenido del post.
     */
    public String getContent() {
        return content;
    }
    /**
     * Obtiene el nombre de usuario que realizó el post.
     * @return El nombre de usuario que realizó el post.
     */
    public String getUsername() {
        return username;
    }
    /**
     * Establece el nombre de usuario que realizó el post.
     * @param username El nombre de usuario que realizó el post.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Establece el contenido del post.
     * @param content El contenido del post.
     */    
    public void setContent(String content) {
        this.content = content;
    }
}
