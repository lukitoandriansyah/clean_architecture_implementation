package jav002.infrastructure.delivery.rest;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRest implements Serializable {
    private static final long serialVersionUID = 7809559376441998463L;

    @NotNull
    private String name;
    @NotNull
    private Boolean available;
}
