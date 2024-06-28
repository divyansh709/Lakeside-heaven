package com.dailycodework.lakesidehotel.exception;

/**
 * @author Divyansh
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
