package ru.durnov.model;

public enum PayMent {
    NULLPERCENT("0%"),
    FORTYPERCENT("40%"),
    FIFTYPERCENT("50%"),
    EIGHTYPERCENT("80%"),
    HUNDREDPERCENT("100%"),
    DEFAULTPAYMANET("Оплата")
    ;

    private String payment;

    PayMent(String payment){
        this.payment = payment;
    }
}
