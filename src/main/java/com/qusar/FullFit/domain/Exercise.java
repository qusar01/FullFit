package com.qusar.FullFit.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exercise {

    private Long id;

    private String name;

    private Integer sets;

    private Integer reps;

    private Double weight;

    private Long workout_id;
}
