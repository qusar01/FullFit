package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Long> {
}
