package com.yeahbutstill.restfulwebservices.exceptions;

import java.util.Date;

public class ExceptionResponse {

    // timestamp
    private Date timestamp;

    // message
    private String message;

    // detail
    private String detail;

    public ExceptionResponse() {
    }

    public ExceptionResponse(Date timestamp, String message, String detail) {
        this.timestamp = timestamp;
        this.message = message;
        this.detail = detail;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetail() {
        return detail;
    }
}
