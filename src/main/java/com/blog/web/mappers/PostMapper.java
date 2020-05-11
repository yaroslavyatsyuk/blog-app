package com.blog.web.mappers;

import com.blog.domain.Post;
import com.blog.web.dto.PostDto;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    PostDto postToPostDto(Post entity);

    Post postDtoToPost(PostDto postDto);
}
