package com.qusar.FullFit.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FoodItem {

    private Long id;

    private String name;

    private double quantity;

    private double calories;

    private Long meal_id;
}
