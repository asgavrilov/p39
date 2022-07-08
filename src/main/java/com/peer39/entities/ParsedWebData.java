package com.peer39.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@Getter
@NoArgsConstructor
public class ParsedWebData {

    private String url;

    public ParsedWebData(@NonNull String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParsedWebData parsedWebData = (ParsedWebData) o;

        return getUrl().equals(parsedWebData.getUrl());
    }

    @Override
    public int hashCode() {
        return getUrl().hashCode();
    }
}
