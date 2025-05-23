package org.annu.blog.services;

import org.annu.blog.domain.CreatePostRequest;
import org.annu.blog.domain.UpdatePostRequest;
import org.annu.blog.domain.entities.Post;
import org.annu.blog.domain.entities.User;

import java.util.List;
import java.util.UUID;

public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
