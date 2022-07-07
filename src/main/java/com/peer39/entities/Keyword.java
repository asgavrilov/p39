package com.peer39.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Keyword {
    private String keyword;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Keyword keyword1 = (Keyword) o;
        return getKeyword().equals(keyword1.getKeyword());
    }

    @Override
    public int hashCode() {
        return getKeyword().hashCode();
    }
}
