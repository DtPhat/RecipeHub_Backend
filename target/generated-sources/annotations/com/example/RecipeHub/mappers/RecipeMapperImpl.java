package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.RecipeDTO;
import com.example.RecipeHub.entities.Recipe;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:30+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class RecipeMapperImpl implements RecipeMapper {

    @Override
    public RecipeDTO recipeToRecipeDto(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeDTO recipeDTO = new RecipeDTO();

        recipeDTO.setUserId( RecipeMapper.mapSender( recipe.getUser() ) );
        recipeDTO.setIngredients( RecipeMapper.mapIngredients( recipe.getIngredients() ) );
        recipeDTO.setImages( RecipeMapper.mapImages( recipe.getImages() ) );
        recipeDTO.setTags( RecipeMapper.mapTag( recipe.getTags() ) );
        recipeDTO.setPrivacyStatus( RecipeMapper.mapPrivacyStatus( recipe.getPrivacyStatus() ) );
        recipeDTO.setVerified( recipe.isVerified() );
        recipeDTO.setRecipe_id( recipe.getRecipe_id() );
        recipeDTO.setTitle( recipe.getTitle() );
        recipeDTO.setPre_time( recipe.getPre_time() );
        recipeDTO.setCook_time( recipe.getCook_time() );
        recipeDTO.setRecipe_yield( recipe.getRecipe_yield() );
        recipeDTO.setRating( recipe.getRating() );
        recipeDTO.setIs_favourite( recipe.isIs_favourite() );
        recipeDTO.setDescription( recipe.getDescription() );
        recipeDTO.setUnit( recipe.getUnit() );
        recipeDTO.setSteps( recipe.getSteps() );
        recipeDTO.setNutrition( recipe.getNutrition() );

        return recipeDTO;
    }

    @Override
    public Recipe recipeDtoToRecipe(RecipeDTO recipeDTO) {
        if ( recipeDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setUser( RecipeMapper.mapUserFromDto( recipeDTO.getUserId() ) );
        recipe.setIngredients( RecipeMapper.mapIngredientsFromDto( recipeDTO.getIngredients() ) );
        recipe.setImages( RecipeMapper.mapImagesFromDto( recipeDTO.getImages() ) );
        recipe.setTags( RecipeMapper.mapTagsFromDto( recipeDTO.getTags() ) );
        recipe.setPrivacyStatus( RecipeMapper.mapPrivacyStatusFromDto( recipeDTO.getPrivacyStatus() ) );
        if ( recipeDTO.getVerified() != null ) {
            recipe.setVerified( recipeDTO.getVerified() );
        }
        recipe.setRecipe_id( recipeDTO.getRecipe_id() );
        recipe.setTitle( recipeDTO.getTitle() );
        recipe.setPre_time( recipeDTO.getPre_time() );
        recipe.setCook_time( recipeDTO.getCook_time() );
        recipe.setRecipe_yield( recipeDTO.getRecipe_yield() );
        recipe.setRating( recipeDTO.getRating() );
        recipe.setIs_favourite( recipeDTO.isIs_favourite() );
        recipe.setDescription( recipeDTO.getDescription() );
        recipe.setUnit( recipeDTO.getUnit() );
        recipe.setSteps( recipeDTO.getSteps() );
        recipe.setNutrition( recipeDTO.getNutrition() );

        return recipe;
    }
}
