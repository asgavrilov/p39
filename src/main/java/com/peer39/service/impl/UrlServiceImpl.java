package com.peer39.service.impl;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;
import com.peer39.exceptions.UrlDownloadException;
import com.peer39.service.DownloaderConverterService;
import com.peer39.service.UrlService;
import com.peer39.service.WebpageDataStorage;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class UrlServiceImpl implements UrlService {

    @Autowired
    WebpageDataStorage webpageDataStorage;

    @Autowired
    DownloaderConverterService downloaderConverterService;

    @Override
    public List<UrlResultDto> getTextFromUrls(List<UrlDto> urls) {
        return urls.stream().map(this::getTextFromUrl).toList();
    }

    private UrlResultDto getTextFromUrl(UrlDto urlDto) {
        String inputUrl = urlDto.getInputUrl();
        String htmlToText;
        try {
            htmlToText = downloaderConverterService.download(inputUrl);

        } catch (Exception e) {
            log.error("Error occurred during downloading url {}", inputUrl);
            throw new UrlDownloadException(inputUrl);
        }
        log.info("Getting text from HTML body for url {}", inputUrl);
        return new UrlResultDto(inputUrl, htmlToText);
    }
}
