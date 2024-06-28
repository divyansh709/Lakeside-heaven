package com.dailycodework.lakesidehotel.exception;

/**
 * @author Divyansh
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
