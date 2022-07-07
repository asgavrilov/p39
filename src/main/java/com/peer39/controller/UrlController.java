package com.peer39.controller;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;
import com.peer39.service.UrlService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.peer39.configuration.ApiConstants.REST_SERVICE_URL;

@RestController
@CrossOrigin
@RequestMapping(value = REST_SERVICE_URL)
@Slf4j
@ApiOperation("URL Processor API")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/urls")
    @ApiOperation(
            value = "Get plain text from html by provided url",
            notes = "Returns a product as per the id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 404, message = "Not found - The url was incorrect")
    })
    public List<UrlResultDto> getUrlText(@RequestBody List<UrlDto> urlDto) {
        List<UrlResultDto> resultDtos = urlService.getTextFromUrls(urlDto);
        log.info("getting text from webpage body for {} urls", urlDto.size());
        return resultDtos;
    }
}