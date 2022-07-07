package com.peer39.service;

import com.peer39.entities.Category;

import java.util.Set;

public interface CategoryStorage {

    void addCategory(Category category);

    Set<Category> getCategories();
}
