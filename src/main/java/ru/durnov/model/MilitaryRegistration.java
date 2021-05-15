package ru.durnov.model;

public enum MilitaryRegistration {
    GENERIC("общий"),
    SPECIAL("специальный"),
    DEFAULTREGISTRATION("воинский учет");

    private String militaryRegistration;

    MilitaryRegistration(String militaryRegistration){
        this.militaryRegistration = militaryRegistration;
    }
}
