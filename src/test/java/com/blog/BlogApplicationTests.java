package com.blog;

import com.blog.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private PostRepository postRepository;

    @Test
    void contextLoads() {
        postRepository.findByTitle("my first post about PHP")
                .ifPresent(System.out::println);
    }

}
