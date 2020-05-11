package com.blog.web.controller;

import com.blog.service.PostService;
import com.blog.web.dto.PostDto;
import com.blog.web.dto.request.CreateOrUpdatePostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/search")
    public ResponseEntity<PostDto> getPostById(@RequestParam("title") String title) {
        return ResponseEntity.ok(postService.findPostByTittle(title));
    }

    @PostMapping
    public ResponseEntity<PostDto> save(@RequestBody CreateOrUpdatePostRequest postRequest, HttpServletRequest request) {
        final PostDto postDto = PostDto.builder()
                .title(postRequest.getTitle())
                .body(postRequest.getBody())
                .build();

        final PostDto newPost = postService.save(postDto);
        return ResponseEntity.created(URI.create(request.getRequestURL() + "/" + newPost.getId())).build();
    }
}
