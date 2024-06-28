package com.dailycodework.lakesidehotel.exception;

/**
 * @author Divyansh
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
