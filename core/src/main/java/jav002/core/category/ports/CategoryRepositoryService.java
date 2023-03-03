package jav002.core.category.ports;

import jav002.core.category.Category;

import java.util.Collection;

public interface CategoryRepositoryService {
    public Collection<Category> getAllCategories();
    public void saveCategory(Category category);
    public Boolean doesCategoryNameExists(String name);

}
