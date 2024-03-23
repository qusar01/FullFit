package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.Challenge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

@Repository
public interface ChallengeRepository extends CrudRepository<Challenge, Long> {
}
