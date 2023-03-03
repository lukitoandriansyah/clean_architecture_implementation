package jav002.infrastructure.delivery.converters;

import jav002.core.category.Category;
import jav002.infrastructure.delivery.rest.CategoryRest;
import jav002.infrastructure.shared.RestConverter;

public class CategoryRestConverter implements RestConverter<CategoryRest, Category> {
    @Override
    public Category mapToEntity(final CategoryRest categoryRest){
        return new Category(null, categoryRest.getName(), categoryRest.getAvailable());
    }

    @Override
    public CategoryRest mapToRest(final Category category){
        return new CategoryRest(category.getName(), category.getAvailable());
    }
}
