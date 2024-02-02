package com.example.unit.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name="GROUND")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ground {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name="MODIFIED_DATE")
    private LocalDateTime modifiedDate;
}
