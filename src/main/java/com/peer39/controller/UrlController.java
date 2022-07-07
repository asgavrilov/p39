package com.peer39.controller;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;
import com.peer39.service.UrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.peer39.configuration.ApiConstants.REST_SERVICE_URL;

@RestController
@CrossOrigin
@RequestMapping(value = REST_SERVICE_URL)
@Slf4j
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/urls")
    public List<UrlResultDto> getUrlText(@RequestBody List<UrlDto> urlDto) {
        List<UrlResultDto> resultDtos = urlService.getTextFromUrls(urlDto);
        log.info("getting text from webpage body for {} urls", urlDto.size());
        return resultDtos;
    }
}