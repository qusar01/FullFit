package com.qusar.FullFit.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meal {

    private Long id;

    private LocalDate date;

    private double totalCalories;

    private List<FoodItem> foodItemList;

    private Long user_id;
}
