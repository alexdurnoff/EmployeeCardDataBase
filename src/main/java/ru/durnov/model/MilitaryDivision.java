package ru.durnov.model;

public enum MilitaryDivision {
    MEDICAL("медицинский"),
    COMMAND("командный"),
    SOLDIER("солдаты"),
    SAILOR("матрос"),
    DEFAULTMILITARYDIVISION("воинский состав(профиль)");

    private String militaryDivision;

    MilitaryDivision(String militaryDivision){
        this.militaryDivision = militaryDivision;
    }
}
