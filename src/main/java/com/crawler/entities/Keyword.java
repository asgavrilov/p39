package com.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Keyword {
    private String keywordValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyword keyword1 = (Keyword) o;
        return getKeywordValue().equals(keyword1.getKeywordValue());
    }

    @Override
    public int hashCode() {
        return getKeywordValue().hashCode();
    }
}
