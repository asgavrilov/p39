package com.peer39.controller;

import com.peer39.dto.ParsedWebDataCategoriesDto;
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

import static com.peer39.configuration.ApiConstants.*;

@RestController
@CrossOrigin
@RequestMapping(value = REST_SERVICE_URL)
@Slf4j
@ApiOperation("URL Processor API")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping(URLS)
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
    @PostMapping(value = PARSED_WEBDATA_CATEGORIES)
    public List<ParsedWebDataCategoriesDto> getParsedWebDataCategories(@RequestBody List<UrlDto> urlDto) {
        List<ParsedWebDataCategoriesDto> parsedWebDataCategoriesDto = urlService.getListParsedWebDataCategories(urlDto);
        log.info("getting categories for parsed websites {}", urlDto.toString());
        return parsedWebDataCategoriesDto;
    }
}