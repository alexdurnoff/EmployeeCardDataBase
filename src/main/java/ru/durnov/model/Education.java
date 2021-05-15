package ru.durnov.model;

public enum Education {
    GENERIC("общее"),
    GENERICMIDDLE("общее среднее"),
    GENERICSPECIAL("общее специальное"),
    SPECIAL("специальное"),
    MIDDLESPECIAL("среднее специальное"),
    PORFTECH("проофессионально-техническое"),
    HIGHSCOOL("высшее профессиональное"),
    DEFAULT("образование");

    private String education;

    Education(String title){
        this.education = education;
    }
}
