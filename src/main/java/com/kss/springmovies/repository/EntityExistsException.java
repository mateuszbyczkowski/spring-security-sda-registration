package com.kss.springmovies.repository;

public class EntityExistsException extends RuntimeException {

    public EntityExistsException() {
    }

    public EntityExistsException(String message) {
        super(message);
    }
}
