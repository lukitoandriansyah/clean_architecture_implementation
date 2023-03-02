package jav002.core.category.usecase;

import jav002.core.category.Category;

import java.util.Collection;

public interface GetAllCategoriesUseCase {
    public Collection<Category> execute();
}
