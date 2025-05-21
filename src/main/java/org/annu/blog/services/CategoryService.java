package org.annu.blog.services;

import org.annu.blog.domain.entities.Category;

import java.util.List;
import java.util.UUID;


public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);
    Category getCategoryById(UUID id);
}
