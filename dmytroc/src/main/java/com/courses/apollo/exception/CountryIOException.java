package com.courses.apollo.exception;

/**
 * Custom exception for IOCountryUtil.
 * Gives message for read and write country object.
 */
public class CountryIOException extends Exception {

    /**
     * Error code of exception.
     */
    private final String errorCode;

    public CountryIOException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
