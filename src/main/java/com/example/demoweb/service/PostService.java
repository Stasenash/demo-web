package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Service
public class PostService {

    public ArrayList<Post> listAllPosts() {
        return new ArrayList<Post>(Arrays.asList(
                new Post("первый пост", new Date()),
                new Post("второй пост", new Date()),
                new Post("третий пост", new Date())
        ));
    }
}
