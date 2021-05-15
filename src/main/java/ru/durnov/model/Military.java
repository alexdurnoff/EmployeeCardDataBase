package ru.durnov.model;

import javax.persistence.Embedded;

public class Military {

    @Embedded
    private AvailableCategory availableCategory;

    @Embedded
    private MilitaryDivision militaryDivision;

    @Embedded
    private MilitaryRank militaryRank;

    @Embedded
    private MilitaryRegistration militaryRegistration;

    private String registrationMark;
}
