package org.example.entities;

public class Director extends Employer {

    private String carrer;

    protected Director(String firstName, String lastName, int edad, Identification document, double salary, String dateOfAdmission, String carrer) {
        super(firstName, lastName, edad, document, salary, dateOfAdmission);
        this.carrer = carrer;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
}
