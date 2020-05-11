package com.blog.repository;

import com.blog.domain.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void savePostTest() {
        Post post = Post.builder()
                .title("java11")
                .body("hello world")
                .build();

        Post save = postRepository.save(post);
        System.out.println(save);

        assertNotNull(save);
    }

    @Test
    public void findByPostByTitleTest() {
        postRepository.findByTitle("java11")
                .forEach(System.out::println);
    }

}