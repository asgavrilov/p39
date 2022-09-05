package com.crawler.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ParsedWebDataCategoriesDto {
    String url;
    Set<String> categories;
}
