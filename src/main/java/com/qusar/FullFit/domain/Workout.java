package com.qusar.FullFit.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workout_id_seq")
    private Long id;

    private LocalDate date;

    private LocalTime duration;

    private String type;

    private Double caloriesBurned;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "workout", fetch = FetchType.EAGER)
    private List<Exercise> exercises;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return Objects.equals(id, workout.id) &&
                Objects.equals(date, workout.date) &&
                Objects.equals(duration, workout.duration) &&
                Objects.equals(type, workout.type) &&
                Objects.equals(caloriesBurned, workout.caloriesBurned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, duration, type, caloriesBurned);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", date=" + date +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }
}