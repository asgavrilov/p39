package com.peer39.service.impl;

import com.peer39.service.WebpageDataStorage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class WebpageDataStorageImpl implements WebpageDataStorage {

    private Map<String, String> htmlMap = new HashMap<>();
//    private Map<String, Webpage> webpageMap = new HashMap<>();

//    @Override
//    public Webpage addWebpage(Webpage webpage) {
//       return webpageMap.put(webpage.getUrl(), webpage);
//    }

//    @Override
//    public Webpage getWebpage(String url) {
//        return webpageMap.get(url);
//    }

    @Override
    public String addWebpageHtml(String url, String html) {
        htmlMap.put(url, html);
        return html;
    }

    @Override
    public String getWebpageHtml(String url) {
        return htmlMap.get(url);
    }
}
