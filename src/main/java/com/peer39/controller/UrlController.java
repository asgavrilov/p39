package com.peer39.controller;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;
import com.peer39.service.UrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.peer39.configuration.ApiConstants.REST_SERVICE_URL;

@RestController
@RequestMapping(value = REST_SERVICE_URL)
@Slf4j
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/urls")
    public List<UrlResultDto> getUrlText(@RequestBody List<UrlDto> urlDto) {
        List<UrlResultDto> resultDtos = urlService.getTextFromUrl(urlDto);
        log.info("getting text from webpage body for {} urls", urlDto.size());
        return resultDtos;
    }
}

//        String[] blogUrl = {
//                "https://bbc.com",
//                "https://www.glamour.de/artikel/victoria-beckham-kleid-farbe-hochzeitsgast",
////                "https://edition.cnn.com"
//                "https://www.tvblog.it/post/1681999/valerio-fabrizio-salvatori-gli-inseparabili-chi-sono-pechino-express-2020"
//        };