package io.github.mat3e.springtricks;

import static lombok.AccessLevel.PROTECTED;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@NoArgsConstructor(access = PROTECTED)
@Table("categories")
class Category {

    @Id
    private Long id;
    @NotBlank
    private String code;
    @NotBlank
    private String name;
    private String description;
    private String imageUrl;
    @Column("is_deprecated")
    private boolean deprecated;
}
