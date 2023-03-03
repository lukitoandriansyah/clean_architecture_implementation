package jav002.infrastructure.persistence.impl;

import jav002.core.category.ports.CategoryRepositoryService;
import jav002.infrastructure.persistence.converters.CategoryRepositoryConverter;
import jav002.infrastructure.persistence.repositories.CategoryRepository;
import jav002.core.category.Category;
import lombok.AllArgsConstructor;

import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CategoryServiceImpl implements CategoryRepositoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryRepositoryConverter categoryRepositoryConverter;

    @Override
    public Collection<Category> getAllCategories() {
        return categoryRepository.findAll().stream().map(category->categoryRepositoryConverter.mapToEntity(category))
                .collect(Collectors.toList());
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(categoryRepositoryConverter.mapToTable(category));
    }

    @Override
    public Boolean doesCategoryNameExists(String name) {
        return !categoryRepository.findByName(name).isEmpty();
    }
}
