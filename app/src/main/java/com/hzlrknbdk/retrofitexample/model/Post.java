package com.hzlrknbdk.retrofitexample.model;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userID;
    private int id;
    private String title;

    @SerializedName("body")
    private String text;

    public Post(int userID, int id, String title, String text) {
        this.userID = userID;
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
