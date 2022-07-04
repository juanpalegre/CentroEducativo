package org.example.entities;

public abstract class Employer extends EducationCommunity {

    private double salary;
    private String dateOfAdmission;

    protected Employer(String firstName, String lastName, int edad, Identification document, double salary, String dateOfAdmission) {
        super(firstName, lastName, edad, document);
        this.salary = salary;
        this.dateOfAdmission = dateOfAdmission;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
