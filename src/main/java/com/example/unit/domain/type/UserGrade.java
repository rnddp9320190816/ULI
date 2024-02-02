package com.example.unit.domain.type;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum UserGrade {

    VVIP(10, Arrays.asList(MannerGrade.VERY_GOOD,MannerGrade.GOOD)),
    VIP(5, Arrays.asList(MannerGrade.VERY_GOOD,MannerGrade.GOOD,MannerGrade.SOSO)),
    RED_CARD(0,Arrays.asList(MannerGrade.VERY_BAD)),
    NORMAL(0,Arrays.asList(MannerGrade.SOSO,MannerGrade.BAD));


    private int playCount;
    private List<MannerGrade> mannerGrade;
}
