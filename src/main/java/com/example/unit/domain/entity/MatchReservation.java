package com.example.unit.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="MATCH_RESERVATION")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="MATCH_ID")
    private Long matchId;

    @Column(name="GROUND_ID")
    private Long ground;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="CREATED_DATE")
    private LocalDateTime createDate;

    @Column(name="MODIFIED_DATE")
    private LocalDateTime modifiedDate;

}
