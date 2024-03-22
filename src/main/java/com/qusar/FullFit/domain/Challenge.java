package com.qusar.FullFit.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Challenge {

    private Long id;

    private String name;

    private LocalDate start_date;

    private LocalDate end_date;

    private String desc;

    private List<User> participants;

    private Long winner;
}
