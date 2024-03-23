package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal, Long> {
}
