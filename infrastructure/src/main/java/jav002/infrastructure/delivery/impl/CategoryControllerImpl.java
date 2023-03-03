package jav002.infrastructure.delivery.impl;

import jakarta.validation.Valid;
import jav002.core.category.exception.CategoryAlreadyExistException;
import jav002.core.category.usecase.CreateCategoryUseCase;
import jav002.core.category.usecase.GetAllCategoriesUseCase;
import jav002.infrastructure.delivery.CategoryController;
import jav002.infrastructure.delivery.converters.CategoryRestConverter;
import jav002.infrastructure.delivery.responses.NetflixResponses;
import jav002.infrastructure.delivery.rest.CategoryRest;
import jav002.infrastructure.shared.constants.CommonConstants;
import jav002.infrastructure.shared.constants.RestConstants;
import jav002.infrastructure.shared.exceptions.NetflixException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(RestConstants.APPLICATION_NAME + RestConstants.API_VERSION+ RestConstants.RESOURCE_CATEGORY)
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {
    private final GetAllCategoriesUseCase getAllCategoriesUseCase;
    private final CreateCategoryUseCase createCategoryUseCase;
    private final CategoryRestConverter categoryRestConverter;

    public NetflixResponses<Collection<CategoryRest>> getCategories() throws NetflixException{
        return new NetflixResponses<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK), CommonConstants.OK,
                getAllCategoriesUseCase.execute().stream().map(category -> categoryRestConverter.mapToRest(category))
                        .collect(Collectors.toList()));
    }

    public NetflixResponses<Boolean> createCategory(@Valid @RequestBody final CategoryRest categoryRest) throws NetflixException {
        try {
            createCategoryUseCase.execute(categoryRestConverter.mapToEntity(categoryRest));
        } catch (CategoryAlreadyExistException e) {
            e.printStackTrace();
        }
        return new NetflixResponses<>(CommonConstants.SUCCESS, String.valueOf(HttpStatus.OK), CommonConstants.OK);
    }
}
