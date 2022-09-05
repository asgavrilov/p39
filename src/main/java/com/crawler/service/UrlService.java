package com.crawler.service;

import com.crawler.dto.ParsedWebDataCategoriesDto;
import com.crawler.dto.UrlDto;
import com.crawler.dto.UrlResultDto;

import java.util.List;

public interface UrlService {
    List<UrlResultDto> getTextFromUrls(List<UrlDto> urls);

    UrlResultDto getTextFromUrl(UrlDto urlDto);

    ParsedWebDataCategoriesDto getParsedWebDataCategories(UrlDto url);

    List<ParsedWebDataCategoriesDto> getListParsedWebDataCategories(List<UrlDto> urlDtos);
}
