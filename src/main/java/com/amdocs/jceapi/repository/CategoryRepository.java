package com.amdocs.jceapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jceapi.domain.Category;

@RepositoryRestResource(path = "Categorias", collectionResourceRel = "Categorias")
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

	public Category findCategoryBycategoryId(@Param ("categoryIdIn") String categoryId);
}
