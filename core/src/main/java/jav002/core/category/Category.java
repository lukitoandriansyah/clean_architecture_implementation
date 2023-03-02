package jav002.core.category;

import jav002.core.shared.SelfValidating;
import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class Category extends SelfValidating<Category> implements Serializable {

    @Min(0)
    private Long id;
    @NotEmpty
    private String name;
    private Boolean available;
}
