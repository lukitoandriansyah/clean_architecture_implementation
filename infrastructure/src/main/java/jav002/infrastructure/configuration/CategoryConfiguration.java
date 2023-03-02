package jav002.infrastructure.configuration;

import jav002.core.category.usecase.CreateCategoryUseCaseImpl;
import jav002.core.category.usecase.GetAllCategoriesUseCaseImpl;
import jav002.infrastructure.delivery.converters.CategoryRestConverter;
import jav002.infrastructure.persistence.converters.CategoryRepositoryConverter;
import jav002.infrastructure.persistence.impl.CategoryServiceImpl;
import jav002.infrastructure.persistence.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfiguration {
    @Autowired
    private CategoryRepository categoryRepository;

    @Bean
    public CategoryRepositoryConverter createCategoryRepositoryConverter() {
        return new CategoryRepositoryConverter();
    }

    @Bean
    public CategoryRestConverter createCategoryRestConverter() {
        return new CategoryRestConverter();
    }

    @Bean
    public CategoryServiceImpl createCategoryServiceImpl() {
        return new CategoryServiceImpl(categoryRepository, createCategoryRepositoryConverter());
    }

    @Bean
    public GetAllCategoriesUseCaseImpl createGetAllCategoriesUseCaseImpl() {
        return new GetAllCategoriesUseCaseImpl(createCategoryServiceImpl());
    }

    @Bean
    public CreateCategoryUseCaseImpl createCategoryUseCase() {
        return new CreateCategoryUseCaseImpl(createCategoryServiceImpl());
    }
}
