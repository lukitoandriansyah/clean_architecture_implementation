package jav002.core.category.ports;

import jdk.jfr.Category;

import java.util.Collection;

public interface CategoryRepositoryService {
    public Collection<Category> getAllCategories();
    public void saveCategory(Category category);
    public Boolean doesCategoryNameExists(String name);

}
