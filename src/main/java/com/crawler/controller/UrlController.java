package com.crawler.controller;

import com.crawler.configuration.ApiConstants;
import com.crawler.dto.ParsedWebDataCategoriesDto;
import com.crawler.dto.UrlResultDto;
import com.crawler.dto.UrlDto;
import com.crawler.service.UrlService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = ApiConstants.REST_SERVICE_URL)
@Slf4j
@ApiOperation("URL Processor API")
@AllArgsConstructor
public class UrlController {

    private final UrlService urlService;

    @PostMapping(ApiConstants.URLS)
    @ApiOperation(
            value = "Get plain text from html by provided url",
            notes = "Returns plain text as per the url")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 401, message = "Not found - The url was incorrect or null")
    })
    public List<UrlResultDto> getUrlText(@RequestBody List<UrlDto> urlDto) {
        List<UrlResultDto> resultDtos = urlService.getTextFromUrls(urlDto);
        log.info("getting text from website body for {} urls", urlDto.size());
        return resultDtos;
    }
    @ApiOperation(
            value = "Get website(s) categories based on provided url(s)",
            notes = "Returns list of categories as per provided url(s)")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 401, message = "Not found - The url was incorrect or null")
    })
    @PostMapping(value = ApiConstants.PARSED_WEBDATA_CATEGORIES)
    public List<ParsedWebDataCategoriesDto> getParsedWebDataCategories(@RequestBody List<UrlDto> urlDto) {
        List<ParsedWebDataCategoriesDto> parsedWebDataCategoriesDto = urlService.getListParsedWebDataCategories(urlDto);
        log.info("getting categories for parsed websites {}", urlDto.toString());
        return parsedWebDataCategoriesDto;
    }
}