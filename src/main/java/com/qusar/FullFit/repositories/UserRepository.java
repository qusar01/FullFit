package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.Challenge;
import com.qusar.FullFit.domain.Meal;
import com.qusar.FullFit.domain.User;
import com.qusar.FullFit.domain.Workout;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u.user_challenges FROM User u WHERE u.id = :userId")
    List<Challenge> findAllChallengesByUserId(Long userId);

    @Query("SELECT u.workouts FROM User u WHERE u.id = :userId")
    List<Workout> findAllWorkoutsByUserId(Long userId);

    @Query("SELECT u.meals FROM User u WHERE u.id = :userId")
    List<Meal> findAllMealsByUserId(Long userId);
}
