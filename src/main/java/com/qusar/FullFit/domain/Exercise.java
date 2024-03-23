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
@Table(name = "exercises")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exercise_id_seq")
    private Long id;

    private String name;

    private Integer sets;

    private Integer reps;

    private Double weight;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workout_id")
    private Workout workout;
}
