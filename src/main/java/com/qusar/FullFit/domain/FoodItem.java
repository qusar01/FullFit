package com.qusar.FullFit.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "fooditems")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fooditem_id_seq")
    private Long id;

    private String name;

    private double quantity;

    private double calories;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "meal_id")
    private Meal meal;
}
