package ru.durnov.model;

import javax.persistence.Embedded;

public class EducationAndFamily {

    private String children;

    @Embedded
    private Education education;

    private String invalid;

    private String institute;

    private String language;

    private String livingArea;
}
