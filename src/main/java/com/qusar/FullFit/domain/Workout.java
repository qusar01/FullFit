package com.qusar.FullFit.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Workout {

    private Long id;

    private LocalDate date;

    private LocalTime duration;

    private String type;

    private Double caloriesBurned;

    private List<Exercise> exerciseList;

    private Long user_id;
}
