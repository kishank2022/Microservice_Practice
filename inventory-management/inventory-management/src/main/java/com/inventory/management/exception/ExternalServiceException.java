package com.inventory.management.exception;

public class ExternalServiceException extends RuntimeException {
    public ExternalServiceException(String msg) {
        super(msg);
    }
}
