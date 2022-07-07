package com.peer39.service;

import java.io.IOException;

public interface ConverterService {
    void convertAll(String[] urls) throws IOException;

    void convert(String url) throws IOException;
}
