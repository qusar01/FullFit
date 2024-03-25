package com.qusar.FullFit.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meal_id_seq")
    private Long id;

    private LocalDate date;

    private double totalCalories;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "meal")
    private List<FoodItem> fooditems;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Double.compare(meal.totalCalories, totalCalories) == 0 &&
                id.equals(meal.id) &&
                date.equals(meal.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, totalCalories);
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", date=" + date +
                ", totalCalories=" + totalCalories +
                '}';
    }
}
