package com.example.tacos.jdbc;
/*
import com.example.tacos.Ingredient;
import com.example.tacos.IngredientRef;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "createdAt")
public class Taco {
    @Id
    private Long id;
    private Date createdAt = new Date();
    @NotNull
    @Size(min = 3, message ="Name must be at least 3 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message ="You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;

    public void addIngredient(Ingredient taco) {
        this.ingredients.add(new IngredientRef(taco.getId()));
    }

}
 */