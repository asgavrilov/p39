package com.peer39.service.impl;

import com.peer39.service.ConverterService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Arrays;

@Service
@Slf4j
public class ConverterServiceImpl implements ConverterService {
    public void convertAll(String[] urls) {
        Arrays.stream(urls).forEach(url -> {
                    try {
                        convert(url);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    public void convert(String url) throws IOException {
        Document doc = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .followRedirects(true)
                .ignoreContentType(true)
                .timeout(5000)
                .get();

//        System.out.println("TITLE " + doc.title() + " $ $  " + doc.body().text());
        log.info("Getting text for page title {} and body {} ", doc.title(), doc.body().text());
    }
}
