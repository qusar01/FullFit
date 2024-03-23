package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
}
