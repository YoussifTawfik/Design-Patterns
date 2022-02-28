package com.design.patterns.exceptions;

public class InvalidCardException extends Exception{

    public InvalidCardException(String message) {
        super(message);
    }
}
