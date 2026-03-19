package org.example;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;


@Entity
@Table(name="addcourse")
public class addcourseEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Coursename;
    private String Courseyear;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
