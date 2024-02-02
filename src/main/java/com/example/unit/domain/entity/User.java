package com.example.unit.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name="USER")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate;

    @Column(name="MODIFIED_DATE")
    private LocalDateTime modifiedDate;
}
