package org.example.entities;

import java.util.List;

public class Profesor extends Employer {

    private String cursos;

    protected Profesor(String firstName, String lastName, int edad, Identification document, double salary, String dateOfAdmission) {
        super(firstName, lastName, edad, document, salary, dateOfAdmission);
    }
}
