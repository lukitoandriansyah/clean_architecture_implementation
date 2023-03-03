package jav002.infrastructure.persistence.repositories;

import jav002.core.category.Category;
import jav002.infrastructure.persistence.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    public Collection<Category> findByName(String name);
}
