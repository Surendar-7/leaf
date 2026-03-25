package org.example;

import jakarta.persistence.*;

@Entity
@Table(name="CreateExam")
public class CreateExamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String examname;
    private String courseyear;
    private String coursename;

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
    }

    public String getCourseyear() {
        return courseyear;
    }

    public void setCourseyear(String courseyear) {
        this.courseyear = courseyear;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
