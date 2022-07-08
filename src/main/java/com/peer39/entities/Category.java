package com.peer39.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class Category {
    private String categoryName;
    @Setter
    private Set<Keyword> keywords = new HashSet<>();

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean addKeyword(Keyword keyword) {
        if(!keywords.contains(keyword)) {
            return keywords.add(keyword);
        }
        return false;
    }
    public void addKeywords(Set<Keyword> keywords) {
        keywords.forEach(this::addKeyword);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return getCategoryName().equals(category.getCategoryName());
    }

    @Override
    public int hashCode() {
        return getCategoryName().hashCode();
    }
}
