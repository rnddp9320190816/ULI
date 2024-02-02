package com.example.unit.domain.entity;

import com.example.unit.domain.type.Gender;
import com.example.unit.domain.type.MannerGrade;
import com.example.unit.domain.type.UserGrade;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Table(name="PLAYER")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @Column(name="ID")
    private Long id;

    @Column(name="NICK_NAME")
    private String nickName;

    @Enumerated(value = EnumType.STRING)
    @Column(name="GENDER")
    private Gender gender;

    @Enumerated(value = EnumType.STRING)
    @Column(name="MANNER_GRADE")
    private MannerGrade mannerGrade;

    public boolean isPossiblePlayerForMatch(Match match){
        match.
    }



    public UserGrade showMyGrade(int playCount){
        for(UserGrade userGrade : UserGrade.values()){
            if(playCount >= userGrade.getPlayCount() && userGrade.getMannerGrade().contains(this.mannerGrade)){
                return userGrade;
            }
        }
        return UserGrade.NORMAL;
    }
}
