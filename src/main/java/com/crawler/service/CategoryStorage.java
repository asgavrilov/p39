package com.crawler.service;

import com.crawler.entities.Category;

import java.util.Set;

public interface CategoryStorage {

    void addCategory(Category category);

    Set<Category> getCategories();
}
