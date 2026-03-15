package org.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class coursecontroller {
    @GetMapping("/addcourse")
    public String course(Model model){
        model.addAttribute("data", new data());
        return "addcourse";
    }


}
