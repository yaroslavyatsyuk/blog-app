package com.blog.service;

import com.blog.domain.Post;
import com.blog.web.dto.PostDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PostService {
    PostDto findPostByTittle(String title);

    PostDto save(PostDto post);

    List<PostDto> findAll();

    Page<PostDto> findPageOfPosts();

    PostDto delete(String title);

    PostDto update(Post post);
}
