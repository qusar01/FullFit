package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.FoodItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends CrudRepository<FoodItem, Long> {
}
