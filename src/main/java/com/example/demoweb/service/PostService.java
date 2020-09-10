package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }

}