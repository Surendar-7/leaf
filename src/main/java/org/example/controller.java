package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class controller {
//    List<addcourseEntity> data=new ArrayList<>();


    @Autowired
    AddCourseRepo repo;

    @Autowired
    AddStuRepo addStuRepo;

    @Autowired
    CreateExamRepo CreateExamrepo;

    @Autowired
    AddExamResultsRepo AddExamResultsrepo;


    @GetMapping("/managestudent")    // it is started the main page

    public String manage(Model model) {
        model.addAttribute("addcourseEntity", new addcourseEntity());
        return "managestudent";
    }

    @GetMapping("/addcourse")      // it is also stared this page then it is show the text box area
    public String course(Model model) {
        model.addAttribute("addcourseEntity", new addcourseEntity());
        return "addcourse";
    }

    @PostMapping("/addcourse")     // MA is main it is referce the DB name AND stored the data to the VARNAME "S"
    public String save(@ModelAttribute("addcourseEntity") addcourseEntity addcourse, Model model) {
        repo.save(addcourse);             // it is save the all data to DB AND tp the ADDCOURSE page
        return "addcourse";
    }

    @GetMapping("/viewcourse")
    public String viewcourse(Model model) {
        model.addAttribute("addcourseEntity", repo.findAll());
        return "viewcourse";
    }


    //ADDSTUDENTS PAGE

    @GetMapping("/AddStudent")  // it is started the addstudents page form server side
    public String addstu(Model model) {
        model.addAttribute("AddStuEntity", new AddStuEntity());
        return "addstudent";
    }

    @PostMapping("/AddStudent")  // it can get the data from user and stored the data to the database
    public String AddStudent(@ModelAttribute("AddStuEntity") AddStuEntity addstu) {
        addStuRepo.save(addstu);
        return "addstudent";

    }

    @GetMapping("/viewstudent")
    public String viewstu(Model model) {
        model.addAttribute("AddStuEntity", addStuRepo.findAll());
        return "viewstudents";
    }

    // CREATE EXAM PAGE

    @GetMapping("/CreateExam")   // run the create exam page
    public String CreateExam(Model model){
        model.addAttribute("CreateExamEntity" , new CreateExamEntity() );
        return "createexam";
    }


    @PostMapping("/CreateExam")
    public String ce(@ModelAttribute("CreateExamEntity") CreateExamEntity CreateExam){
        CreateExamrepo.save(CreateExam);
        return "createexam";
    }

    @GetMapping("/viewexam")
    public String viewexam(Model model) {
        model.addAttribute("CreateExamEntity", CreateExamrepo.findAll());
        return "viewexam";
    }


    // AddExamResults page


    @GetMapping("/AddExamResults")
    public String AddExamResults(Model model){
        model.addAttribute("AddExamResultsEntity" , new AddExamResultsEntity());
        return "AddExamResults";

    }

    @PostMapping("/AddExamResults")
    public  String aer(@ModelAttribute("AddExamResultsEntity") AddExamResultsEntity AddExamResultsEntity){
        AddExamResultsrepo.save(AddExamResultsEntity);
        return "AddExamResults";
    }

    @GetMapping("/ViewExamResults")
    public String ver(Model model){
        model.addAttribute("AddExamResultsEntity", AddExamResultsrepo.findAll());
        return "ViewExamResults";
    }

}
