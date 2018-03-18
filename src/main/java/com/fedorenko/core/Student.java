package com.fedorenko.core;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String Pib;
    private double Course;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Double.compare(student.getCourse(), getCourse()) == 0 &&
                Objects.equals(getPib(), student.getPib());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPib(), getCourse());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPib() {
        return Pib;
    }

    public void setPib(String pib) {
        Pib = pib;
    }

    public double getCourse() {
        return Course;
    }

    public void setCourse(double course) {
        Course = course;
    }

}
