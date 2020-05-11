package com.blog.web.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateOrUpdatePostRequest {

    @NotBlank
    private final String title;

    @NotBlank
    private final String body;

    @JsonCreator
    public CreateOrUpdatePostRequest(@JsonProperty("title") String title,
                                     @JsonProperty("body") String body) {
        this.title = title;
        this.body = body;
    }
}
