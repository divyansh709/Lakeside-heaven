package com.dailycodework.lakesidehotel.exception;

/**
 * @author Divyansh
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
