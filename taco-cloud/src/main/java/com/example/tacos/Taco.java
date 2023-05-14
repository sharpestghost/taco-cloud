package com.example.tacos;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
    private Long id;
    private Date createdAt = new Date();
    @NotNull
    @Size(min = 3, message ="Name must be at least 3 characters long")
    private String name;

    @NotNull
    @Size(min = 2, message ="You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;

    public void addIngredient(Ingredient taco) {
        this.ingredients.add(new IngredientRef(taco.getId()));
    }

}