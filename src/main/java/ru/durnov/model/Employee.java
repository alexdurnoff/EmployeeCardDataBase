package ru.durnov.model;


import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private Image image;

    @Embedded
    private Document document;

    @Embedded
    private Job job;

    @Embedded
    private Military military;

    @Embedded
    private Contacts contacts;

    @Embedded
    @Column(name = "education")
    private EducationAndFamily educationAndFamily;

    @Embedded
    private Certificate certificate;

    @Embedded
    private Dossier dossier;
}
