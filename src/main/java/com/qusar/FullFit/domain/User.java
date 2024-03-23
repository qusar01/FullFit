package com.qusar.FullFit.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    private Long id;

    private String username;

    private String password;

    private String email;

    private Double height;

    private Double weight;

    private Integer age;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "challenge_participation",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "challenge_id")
    )
    private ArrayList<Challenge> user_challenges;
}
