package org.annu.blog.repositories;

import org.annu.blog.domain.PostStatus;
import org.annu.blog.domain.entities.Category;
import org.annu.blog.domain.entities.Post;
import org.annu.blog.domain.entities.Tag;
import org.annu.blog.domain.entities.User;
//import org.annu.blog.services.PostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);
    List<Post> findAllByStatus(PostStatus status);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus status);
}
