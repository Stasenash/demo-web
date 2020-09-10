package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate){
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
        this.likes = 0;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
