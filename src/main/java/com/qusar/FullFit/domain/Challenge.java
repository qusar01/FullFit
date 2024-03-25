package com.qusar.FullFit.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "challenges")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "challenge_id_seq")
    private Long id;

    private String name;

    private LocalDate start_date;

    private LocalDate end_date;

    private String description;

    @ManyToMany(mappedBy = "user_challenges", cascade = CascadeType.ALL)
    private List<User> participants;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User winner;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Challenge challenge = (Challenge) o;
        return id.equals(challenge.id) &&
                name.equals(challenge.name) &&
                start_date.equals(challenge.start_date) &&
                end_date.equals(challenge.end_date) &&
                description.equals(challenge.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, start_date, end_date, description);
    }
    @Override
    public String toString() {
        return "Challenge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", description='" + description + '\'' +
                '}';
    }
}
