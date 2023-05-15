package com.example.tacos.data;

import com.example.tacos.Ingredient;
import com.example.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;
import java.util.List;

@Repository
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}