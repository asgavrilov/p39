package com.peer39.service;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;

import java.util.List;

public interface UrlService {
    List<UrlResultDto> getTextFromUrl(List<UrlDto> urls);
}
