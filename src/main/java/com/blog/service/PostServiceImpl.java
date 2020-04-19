package com.blog.service;

import com.blog.entity.Post;
import com.blog.exception.BlogEntityNotFoundException;
import com.blog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public Post findPostByTittle(String title) {
        return postRepository.findByTitle(title)
                .orElseThrow(BlogEntityNotFoundException::new);
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public Page<Post> findPageOfPosts() {
        return null;
    }

    @Override
    public Post delete(String title) {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }
}
