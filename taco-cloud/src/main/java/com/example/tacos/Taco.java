package com.example.tacos;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {
    @NotNull
    @Size(min = 3, message ="Name must be at least 3 characters long")
    private String name;

    @NotNull
    @Size(min = 2, message ="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

}