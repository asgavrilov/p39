package com.crawler.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor

public class UrlDto {
    String inputUrl;

    @Override
    public String toString() {
        return "\n inputUrl='" + inputUrl + '\'' +
                '}';
    }
}
