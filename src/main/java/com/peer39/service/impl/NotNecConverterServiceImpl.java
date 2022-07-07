package com.peer39.service.impl;

import com.peer39.service.NotNecConverterService;
import com.peer39.service.DownloaderConverterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotNecConverterServiceImpl implements NotNecConverterService {

    @Autowired
    DownloaderConverterService downloaderConverterService;

//    public void convertAll(List<UrlDto> urls) {
//        urls.forEach(url -> {
//                    try {
//                        downloadAndConvert(url);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//        );
//    }

//    @Override
//    public UrlResultDto downloadAndConvert(UrlDto url) {
//        try {
//            return new UrlResultDto(
//                    url.getInputUrl(),
//                    downloaderService.download(url.getInputUrl()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    public UrlResultDto downloadAndConvert(String url) throws IOException {
////        Document doc = Jsoup.connect(url)
////                .method(Connection.Method.GET)
////                .followRedirects(true)
////                .ignoreContentType(true)
////                .timeout(5000)
////                .get();
////        log.info("Getting text for page title {} and body {} ", doc.title(), doc.body().text());
//        return new UrlResultDto(url, downloaderService.download(url));

//        System.out.println("TITLE " + doc.title() + " $ $  " + doc.body().text());

}
