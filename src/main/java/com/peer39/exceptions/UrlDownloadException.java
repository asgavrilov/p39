package com.peer39.exceptions;

public class UrlDownloadException extends RuntimeException {
    public UrlDownloadException(String url) {
        super("Error occurred during url processing " + url);
    }
}
