package jav002.core.category.usecase;

import jav002.core.category.Category;
import jav002.core.category.exception.CategoryAlreadyExistException;
import jav002.core.category.ports.CategoryRepositoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase{

    private final CategoryRepositoryService categoryRepositoryService;

    @Override
    public void execute(Category category) throws CategoryAlreadyExistException {
        if (categoryRepositoryService.doesCategoryNameExists(category.getName())){
            throw new CategoryAlreadyExistException();
        }
        categoryRepositoryService.saveCategory(category);
    }
}
