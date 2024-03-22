package com.qusar.FullFit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Long id;

    private String username;

    private String password;

    private String email;

    private Double height;

    private Double weight;

    private Integer age;

    private List<Workout> workoutList;

    private List<Meal> mealList;

}
