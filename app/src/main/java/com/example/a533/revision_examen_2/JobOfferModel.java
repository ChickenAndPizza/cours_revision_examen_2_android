package com.example.a533.revision_examen_2;

public class JobOfferModel {

    String title;
    String description;
    Double salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public JobOfferModel(String title, String description, Double salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }
}
