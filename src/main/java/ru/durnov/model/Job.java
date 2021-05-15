package ru.durnov.model;

import javax.persistence.Embedded;
import java.time.LocalDate;

public class Job {

    private LocalDate gettingStarted;

    @Embedded
    private Division division;

    @Embedded
    private PayMent payMent;

    @Embedded
    private Post post;

    private String tableNumber;

    private String holidaySchedule;

    private String workSchedule;
}
