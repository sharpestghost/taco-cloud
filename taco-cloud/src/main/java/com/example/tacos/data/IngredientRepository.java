package com.example.tacos.data;

import com.example.tacos.Ingredient;

import java.util.Optional;
import java.util.List;

public interface IngredientRepository {
    List<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}