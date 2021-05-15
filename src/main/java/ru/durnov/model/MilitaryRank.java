package ru.durnov.model;

public enum MilitaryRank {
    DEFAULTRANK("воинское звание"),
    CONSCRIPT("подлежит призыву"),
    PRIVATESOLDIER("рядовой"),
    CORPORAL("ефрейтор"),
    JUNIORSERGANT("младший сержант"),
    SERGANT("сержант"),
    SENOIRSERGANT("старший сержант"),
    PETTYOFFICER("старшина"),
    ENSIGN("прапорщик"),
    SECONDLIEUTENANT("младший лейтенант"),
    LIEUTENANT("лейтенант"),
    SENOIRLIEUTENANT("старший лейтенант"),
    CAPTAIN("капитан"),
    MAJOR("майор"),
    LIEUTENANTCOLONEL("подполковник"),
    COLONEL("полковник"),
    MAJORGHENERAL("генерал-майор"),
    LIEUTENANTGENERAL("генерал-лейтенант"),
    COLONELGENERAL("генерал-полковник");

    private String militaryRAnk;

    MilitaryRank(String title){
        this.militaryRAnk = militaryRAnk;
    }
}
