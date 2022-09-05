package com.crawler.service.impl;


import com.crawler.entities.Category;
import com.crawler.service.CategoryStorage;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Getter
public class CategoryStorageImpl implements CategoryStorage {

    private final Set<Category> categories = new HashSet<>();

    public void addCategory(Category category) {
        categories.add(category);
    }

    public Set<Category> getCategories() {
        return categories;
    }
}
