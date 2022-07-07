package com.peer39.service.impl;


import com.peer39.entities.Category;
import com.peer39.service.CategoryStorage;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CategoriesStorageImpl implements CategoryStorage {

    private final Set<Category> categories = new HashSet<>();

    public void addCategory(Category category) {
        categories.add(category);
    }

    public Set<Category> getCategories() {
        return categories;
    }


}
