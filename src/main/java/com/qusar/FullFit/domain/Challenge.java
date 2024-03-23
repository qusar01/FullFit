package com.qusar.FullFit.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

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
    private ArrayList<User> participants;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User winner;
}
