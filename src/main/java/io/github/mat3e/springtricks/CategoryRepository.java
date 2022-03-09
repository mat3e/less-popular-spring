package io.github.mat3e.springtricks;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = SimpleCategoryVM.class)
interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
