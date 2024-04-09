package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Post;
import persistence.APIPersistence;

import java.util.HashMap;
import java.util.Optional;

@ApplicationScoped
public class PostService {

    @Inject
    APIPersistence posts;

    public HashMap<String, Post> getAllPosts(){
        return posts.getAPIPosts();
    }

    public Optional<Post> addPost(String content, String username){
        if (content.length() <= 140){
            return Optional.of(posts.addPost(content, username));
        }
        return Optional.empty();
    }
}