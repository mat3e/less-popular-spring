package io.github.mat3e.springtricks;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
class TraditionalController {

    private final CategoryRepository repository;

    @GetMapping("/categories")
    List<TextCategoryVM> getTextualCategories() {
        return repository.findTextualCategoriesBy();
    }
}

// no @Projection !!!
interface TextCategoryVM {

    String getCode();

    String getName();

    String getDescription();
}
