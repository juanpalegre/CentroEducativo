package org.example.entities;

public abstract class EducationCommunity {
    private String firstName;
    private String lastName;
    private int edad;
    private Identification document;

    protected EducationCommunity(String firstName, String lastName, int edad, Identification document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.edad = edad;
        this.document = document;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Identification getDocument() {
        return document;
    }

    public void setDocument(Identification document) {
        this.document = document;
    }
}
