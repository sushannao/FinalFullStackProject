package com.example.fullstackproject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private final StringProperty id;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty department;
    private final StringProperty major;
    private final StringProperty email;

    public Student(String id, String firstName, String lastName,
                   String department, String major, String email) {
        this.id = new SimpleStringProperty(id);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.department = new SimpleStringProperty(department);
        this.major = new SimpleStringProperty(major);
        this.email = new SimpleStringProperty(email);
    }

// Getters
    public String getId() {
        return id.get();
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public String getDepartment() {
        return department.get();
    }

    public String getMajor() {
        return major.get();
    }

    public String getEmail() {
        return email.get();
    }
// Property values
    public StringProperty idProperty() {
        return id;
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public StringProperty departmentProperty() {
        return department;
    }

    public StringProperty majorProperty() {
        return major;
    }

    public StringProperty emailProperty() {
        return email;
    }
}
