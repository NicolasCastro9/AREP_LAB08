package model;

public class Post {

    private String id;
    private String content;

    private String username;

    public Post(Integer id, String content, String username) {
        this.id = String.valueOf("P"+id);
        this.content = content;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
