package model;

/**
 * Clase que representa a un usuario de twitter.
 */
public class User {

    private String userId;
    private String username;
    private String password;

    /**
     * Constructor para crear un nuevo usuario.
     * @param userId El identificador único del usuario.
     * @param username El nombre de usuario del usuario.
     * @param password La contraseña del usuario.
     */
    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
    /**
     * Obtiene el identificador único del usuario.
     * @return El identificador único del usuario.
     */
    public String getUserId() {
        return userId;
    }
    /**
     * Establece el identificador único del usuario.
     * @param userId El identificador único del usuario.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * Obtiene el nombre de usuario del usuario.
     * @return El nombre de usuario del usuario.
     */
    public String getUsername() {
        return username;
    }
    /**
     * Establece el nombre de usuario del usuario.
     * @param username El nombre de usuario del usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }
    /**
     * Establece la contraseña del usuario.
     * @param password La contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
