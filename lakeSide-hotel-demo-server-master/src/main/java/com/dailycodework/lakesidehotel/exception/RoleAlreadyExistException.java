package com.dailycodework.lakesidehotel.exception;

/**
 * @author Divyansh
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
