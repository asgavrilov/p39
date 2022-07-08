package com.peer39.service;

import com.peer39.dto.ParsedWebDataCategoriesDto;
import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;

import java.util.List;

public interface UrlService {
    List<UrlResultDto> getTextFromUrls(List<UrlDto> urls);

    UrlResultDto getTextFromUrl(UrlDto urlDto);

    ParsedWebDataCategoriesDto getParsedWebDataCategories(UrlDto url);

    List<ParsedWebDataCategoriesDto> getListParsedWebDataCategories(List<UrlDto> urlDtos);
}
