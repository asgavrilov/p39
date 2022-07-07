package com.peer39.service;

import com.peer39.dto.UrlDto;
import com.peer39.dto.UrlResultDto;

import java.io.IOException;
import java.util.List;

public interface UrlService {
    List<UrlResultDto> getTextFromUrls(List<UrlDto> urls);
}
