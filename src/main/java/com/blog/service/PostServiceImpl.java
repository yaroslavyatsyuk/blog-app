package com.blog.service;

import com.blog.domain.Post;
import com.blog.exceptions.BlogEntityNotFoundException;
import com.blog.repository.PostRepository;
import com.blog.web.dto.PostDto;
import com.blog.web.mappers.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public PostDto findPostByTittle(String title) {
        List<Post> byTitle = postRepository.findByTitle(title);
        if (byTitle.isEmpty()) {
            throw new BlogEntityNotFoundException();
        }

        return postMapper.postToPostDto(byTitle.get(0));
    }

    @Override
    public PostDto save(PostDto post) {
        final Post postEntity = postMapper.postDtoToPost(post);
        return postMapper.postToPostDto(postRepository.save(postEntity));
    }

    @Override
    public List<PostDto> findAll() {
        return null;
    }

    @Override
    public Page<PostDto> findPageOfPosts() {
        return null;
    }

    @Override
    public PostDto delete(String title) {
        return null;
    }

    @Override
    public PostDto update(Post post) {
        return null;
    }
}
