package com.blog.service;

import com.blog.entity.Post;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PostService {
    Post findPostByTittle(String title);

    Post save(Post post);

    List<Post> findAll();

    Page<Post> findPageOfPosts();

    Post delete(String title);

    Post update(Post post);
}
