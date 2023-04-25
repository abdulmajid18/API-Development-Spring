package com.rozz.api.apidevelopment.exceptions;

/**
 * Creation of Error related to REST API calls
 */
public class ErrorUtils {

    private ErrorUtils() {
    }

    /**
     * Creates and return an error object
     *
     * @param errMsgKey
     * @param errorCode
     * @param httpStatusCode
     * @param url
     * @return error
     */

    public static Error createError(final String errMsgKey, final String errorCode,
            final Integer httpStatusCode) {
        Error error = new Error();
        error.setMessage(errMsgKey);
        error.setErrorCode(errorCode);
        error.setStatus(httpStatusCode);
        return error;
    }
}
