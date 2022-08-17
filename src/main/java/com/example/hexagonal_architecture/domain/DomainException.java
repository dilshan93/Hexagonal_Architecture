package com.example.hexagonal_architecture.domain;

class DomainException extends RuntimeException {
    DomainException(final String message) {
        super(message);
    }
}
