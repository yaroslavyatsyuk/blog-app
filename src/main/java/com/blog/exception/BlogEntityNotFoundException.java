package com.blog.exception;

public class BlogEntityNotFoundException extends RuntimeException {
    public BlogEntityNotFoundException() {
    }

    public BlogEntityNotFoundException(String message) {
        super(message);
    }

    public BlogEntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogEntityNotFoundException(Throwable cause) {
        super(cause);
    }

    public BlogEntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
