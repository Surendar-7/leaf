package org.example;


import jakarta.persistence.*;

@Entity
@Table(name="addcourse")
public class addcourseEntity {

@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Coursename;
    private String Courseyear;


    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public String getCourseyear() {
        return Courseyear;
    }

    public void setCourseyear(String courseyear) {
        Courseyear = courseyear;
    }

}
