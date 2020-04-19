package com.blog.controller;

import com.blog.dto.PostDto;
import com.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;
    private final ModelMapper mapper;

    @GetMapping("/search")
    public ResponseEntity<PostDto> getPostById(@RequestParam("title") String title) {
        return ResponseEntity.ok(mapper.map(postService.findPostByTittle(title), PostDto.class));
    }
}
