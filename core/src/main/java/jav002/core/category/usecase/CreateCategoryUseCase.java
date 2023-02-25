package jav002.core.category.usecase;

import jav002.core.category.Category;
import jav002.core.category.exception.CategoryAlreadyExistException;

public interface CreateCategoryUseCase {
    public void execute(Category category) throws CategoryAlreadyExistException;
}
