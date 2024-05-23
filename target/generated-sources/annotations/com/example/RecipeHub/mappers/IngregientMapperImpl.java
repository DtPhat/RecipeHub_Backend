package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.IngredientDTO;
import com.example.RecipeHub.entities.Ingredient;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class IngregientMapperImpl implements IngregientMapper {

    @Override
    public IngredientDTO ingredientToIngredientDto(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientDTO ingredientDTO = new IngredientDTO();

        ingredientDTO.setIngredientId( ingredient.getIngredientId() );
        ingredientDTO.setAmount( ingredient.getAmount() );
        ingredientDTO.setIngredientName( ingredient.getIngredientName() );

        return ingredientDTO;
    }
}
