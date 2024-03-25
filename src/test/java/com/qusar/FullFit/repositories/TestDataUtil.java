package com.qusar.FullFit.repositories;


import com.qusar.FullFit.domain.*;

public class TestDataUtil {

    private TestDataUtil() {
    }

    public static User createTestUser() {
        return User.builder()
                .username("test")
                .password("test")
                .email("test")
                .height(1.0)
                .weight(1.0)
                .age(1)
                .build();
    }

    public static Workout createTestWorkout(User user) {
        return Workout.builder()
                .date(null)
                .duration(null)
                .type("test")
                .caloriesBurned(1.0)
                .user(user)
                .build();
    }

    public static Exercise createTestExercise() {
        return Exercise.builder()
                .name("test")
                .sets(1)
                .reps(1)
                .weight(1.0)
                .build();
    }

    public static Meal createTestMeal() {
        return Meal.builder()
                .date(null)
                .totalCalories(1.0)
                .user(createTestUser())
                .build();
    }

    public static FoodItem createTestFoodItem() {
        return FoodItem.builder()
                .name("test")
                .quantity(1.0)
                .calories(1.0)
                .meal(createTestMeal())
                .build();
    }

    public static Challenge createTestChallenge() {
        return Challenge.builder()
                .name("test")
                .description("test")
                .start_date(null)
                .end_date(null)
                .winner(createTestUser())
                .build();
    }
}
