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
    List<data> userdata=new ArrayList<>();


    List<data> data=new ArrayList<>();


    @Autowired
    addcourseEntity addcourseEntity;


    @GetMapping("/managestudent")

    public String manage(Model model){
        model.addAttribute("data", new data());
        return "managestudent";
    }

    @GetMapping("/addcourse")
    public String course(Model model){
        model.addAttribute("data", new data());
        return "addcourse";
    }



    @PostMapping("/savedata")
    public String save(@ModelAttribute("data")data coursedata) {
        data.add(coursedata);
        return "demo";
    }


//    @GetMapping("/addstudent")
//
//    public String addstudent(Model model){
//        model.addAttribute("data", new data());
//        return "addstudent";
//    }
//
//    @GetMapping("/app")
//    public String login(Model model) {
//        model.addAttribute("data", new data());
//        return "login";
//    }
//
//
//    @GetMapping("/form")
//    public String form(Model model){
//        model.addAttribute("data",new data());
//
//        return "form";
//    }
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute("data")data s){
//        userdata.add(s);
//        return "demo";
//
//    }


}
