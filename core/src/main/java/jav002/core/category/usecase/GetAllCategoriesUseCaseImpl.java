package jav002.core.category.usecase;

import jav002.core.category.ports.CategoryRepositoryService;
import jav002.core.category.Category;
import lombok.AllArgsConstructor;

import java.util.Collection;

@AllArgsConstructor
public class GetAllCategoriesUseCaseImpl implements GetAllCategoriesUseCase{
    private final CategoryRepositoryService categoryRepositoryService;

    @Override
    public Collection<Category> execute() {
        return categoryRepositoryService.getAllCategories();
    }
}
