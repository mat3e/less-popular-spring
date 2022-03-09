package io.github.mat3e.springtricks;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
