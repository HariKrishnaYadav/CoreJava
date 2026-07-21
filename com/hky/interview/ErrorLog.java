package com.hky.interview;

public class ErrorLog {
    private String date;
    private String level;
    private String errorType;

    public ErrorLog(String date, String level, String errorType) {
        this.date = date;
        this.level = level;
        this.errorType = errorType;
    }

    public String getDate() {
        return date;
    }

    public String getLevel() {
        return level;
    }

    public String getErrorType() {
        return errorType;
    }
}