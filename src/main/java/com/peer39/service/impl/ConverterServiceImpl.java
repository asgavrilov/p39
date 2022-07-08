package com.peer39.service.impl;

import com.peer39.service.ConverterService;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Locale;

@Service
public class ConverterServiceImpl implements ConverterService {
    @Value("${app.downloader.followRedirects}")
    private boolean followRedirects;

    @Override
    public String convertHtml(String url) throws IOException {
        return Jsoup.connect(url)
                .followRedirects(followRedirects)
                .referrer(url)
                .get()
                .body()
                .text()
                .toLowerCase(Locale.ROOT)
                .replaceAll("[^a-zA-Z0-9]", " ");
    }
}
