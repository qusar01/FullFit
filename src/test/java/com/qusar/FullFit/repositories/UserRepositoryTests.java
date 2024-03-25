package com.qusar.FullFit.repositories;

import com.qusar.FullFit.domain.User;
import com.qusar.FullFit.domain.Workout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserRepositoryTests {

    private WorkoutRepository forTests;

    @Autowired
    public UserRepositoryTests(WorkoutRepository forTests) {
        this.forTests = forTests;
    }


    @Test
    public void testThatUserCanBeCreated() {
        User user = TestDataUtil.createTestUser();
        Workout workout = TestDataUtil.createTestWorkout(user);
        forTests.save(workout);
        Optional<Workout> result = forTests.findById(workout.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(workout);
    }


}
