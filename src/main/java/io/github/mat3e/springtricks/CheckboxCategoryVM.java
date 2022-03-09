package io.github.mat3e.springtricks;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "checkbox", types = Category.class)
interface CheckboxCategoryVM {

    String getCode();

    String getName();
}
