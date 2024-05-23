package com.example.RecipeHub.mappers;

import com.example.RecipeHub.dtos.MealPlannerResponse;
import com.example.RecipeHub.entities.Meal_planner;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-23T17:45:29+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240417-1011, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class MealPlannerMapperImpl implements MealPlannerMapper {

    @Override
    public MealPlannerResponse mealPlannerTomealPlannerResponse(Meal_planner meal_Planner) {
        if ( meal_Planner == null ) {
            return null;
        }

        MealPlannerResponse mealPlannerResponse = new MealPlannerResponse();

        mealPlannerResponse.setRecipe( MealPlannerMapper.mapRecipe( meal_Planner.getRecipe() ) );
        mealPlannerResponse.setDate( MealPlannerMapper.mapDate( meal_Planner.getDate() ) );
        mealPlannerResponse.setMealPlannerId( meal_Planner.getMealPlannerId() );
        if ( meal_Planner.getMealType() != null ) {
            mealPlannerResponse.setMealType( meal_Planner.getMealType().name() );
        }

        return mealPlannerResponse;
    }
}
