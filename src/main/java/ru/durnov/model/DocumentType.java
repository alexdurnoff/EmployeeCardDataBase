package ru.durnov.model;

public enum DocumentType {
    PASSPORT("паспорт"),
    MIGRATIONCARD("миграционная карта");

    private final String documentType;

    DocumentType(String documentType){
        this.documentType = documentType;
    }

    public DocumentType typeByString(String type){
        if (type.equals("паспорт")) return PASSPORT;
        if (type.equals("миграционная карта")) return MIGRATIONCARD;
        throw new IllegalArgumentException("Некорректное значение типа документа");
    }
}
