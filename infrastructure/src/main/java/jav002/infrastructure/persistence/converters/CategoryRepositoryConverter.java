package jav002.infrastructure.persistence.converters;

import jav002.core.category.Category;
import jav002.infrastructure.persistence.entities.CategoryEntity;
import jav002.infrastructure.shared.RepositoryConverter;

public class CategoryRepositoryConverter implements RepositoryConverter<CategoryEntity, Category> {
    @Override
    public CategoryEntity mapToTable(final Category persistenceObject){
        return new CategoryEntity(persistenceObject.getId(), persistenceObject.getName(), persistenceObject.getAvailable());
    }
    @Override
    public Category mapToEntity(final CategoryEntity entityObject){
        return new Category(entityObject.getId(), entityObject.getName(), entityObject.getAvailable());
    }
}
