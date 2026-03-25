package org.example;


import jakarta.persistence.*;

@Entity
@Table(name = "AddExam")
public class AddExamResultsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String examname;
    private String courseyear;
    private String coursename;
    private String mark;
    private String stuname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }



}
