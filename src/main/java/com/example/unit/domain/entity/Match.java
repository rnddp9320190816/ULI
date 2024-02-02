package com.example.unit.domain.entity;

import com.example.unit.domain.type.MatchGenderType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Table(name="MATCH")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "GENDER_TYPE")
    private MatchGenderType genderType;

    @OneToMany
    @JoinColumn(name = "GROUND_ID")
    private Ground ground;

    @Transient
    public static Long a;




}
