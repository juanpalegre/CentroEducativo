package org.example.entities;

public class Admin extends Employer {

    protected Admin(String firstName, String lastName, int edad, Identification document, double salary, String dateOfAdmission) {
        super(firstName, lastName, edad, document, salary, dateOfAdmission);
    }
}
