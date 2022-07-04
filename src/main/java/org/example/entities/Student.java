package org.example.entities;

public class Student extends EducationCommunity {
    protected Student(String firstName, String lastName, int edad, Identification document) {
        super(firstName, lastName, edad, document);
    }
}
