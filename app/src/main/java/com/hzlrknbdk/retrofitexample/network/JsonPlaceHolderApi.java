package com.hzlrknbdk.retrofitexample.network;

import com.hzlrknbdk.retrofitexample.model.Comment;
import com.hzlrknbdk.retrofitexample.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts();
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
