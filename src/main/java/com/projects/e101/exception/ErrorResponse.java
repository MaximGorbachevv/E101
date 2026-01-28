package com.projects.e101.exception;


import java.util.Map;

public class ErrorResponse {
    private String message;
    private String error;
    private Map<String, String> details;
    public ErrorResponse(String error, String message, Map<String, String> details) {
        this.message = message;
        this.error = error;
        this.details = details;

    }
    public String getMessage() {
        return message;

    }
    public String getError() {
        return error;  }
    public Map<String, String> getDetails() {return details;}

}
