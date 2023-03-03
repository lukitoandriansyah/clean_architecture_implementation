package jav002.infrastructure.delivery;

import jav002.infrastructure.delivery.responses.NetflixResponses;
import jav002.infrastructure.delivery.rest.CategoryRest;
import jav002.infrastructure.shared.exceptions.NetflixException;

import java.util.Collection;

public interface CategoryController {
    NetflixResponses<Collection<CategoryRest>> getCategories()throws NetflixException;
    NetflixResponses<Boolean> createCategory(CategoryRest categoryRest) throws NetflixException;
}
