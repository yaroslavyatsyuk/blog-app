package com.blog.repository;

import com.blog.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PostRepository extends MongoRepository<Post, String> {

    Optional<Post> findByTitle(String title);
}
