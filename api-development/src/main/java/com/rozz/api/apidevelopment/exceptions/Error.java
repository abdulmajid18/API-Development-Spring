package com.rozz.api.apidevelopment.exceptions;

public class Error {
    private static final long serialVersionUID = 1L;

    /**
     * App error code, which is different from HTTP error code.
     */
    private String erroCode;

    /**
     * Short, human-readable summary of the problem.
     */
    private String message;

    /**
     * HTTP status code.
     */
    private Integer status;

    /**
     * Url of request that produced the error.
     */
    private String url = "Not available";

    /**
     * Method of request that produced the error.
     */
    private String reqMethod = "Not available";

    // getters and setters (omitted)

}
