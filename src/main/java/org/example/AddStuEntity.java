package org.example;


import jakarta.persistence.*;

@Entity
@Table(name = "addstuDetails")
public class AddStuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String studentname;
    private String courseyear;
    private String coursename;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
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
