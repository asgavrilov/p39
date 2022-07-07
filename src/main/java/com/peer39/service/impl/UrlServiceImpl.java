package com.peer39.service.impl;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;
import com.peer39.service.DownloaderService;
import com.peer39.service.UrlService;
import com.peer39.service.WebpageStorage;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class UrlServiceImpl implements UrlService {

    @Autowired
    DownloaderService downloaderService;

    @Autowired
    WebpageStorage webpageStorage;

    @Override
    public List<UrlResultDto> getTextFromUrl(List<UrlDto> urls) {



        return null;
    }
}
