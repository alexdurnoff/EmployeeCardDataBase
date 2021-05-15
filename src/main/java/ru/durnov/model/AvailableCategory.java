package ru.durnov.model;

public enum AvailableCategory {
    G("Г"),
    GO("ГО"),
    VN("ВН"),
    NGM("НГМ"),
    NGI("НГИ"),
    GNS("ГНС"),
    IND("ИНД"),
    DEFAULTCATEGORY("категория готовности");

    private String availableCategory;

    AvailableCategory(String availableCategory){
        this.availableCategory = availableCategory;
    }
}
