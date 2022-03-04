package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        // model methods
        model.addAttribute("state","Virginia");
        model.addAttribute("City","Chantilly");

        String county = "Fairfax county";
        model.addAttribute("county", county);

        // create some random student id, display on ui

        int id = new Random().nextInt(1-1000);
        model.addAttribute("id", id);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        model.addAttribute("numbers", numbers)

;
        return"/student/welcome";

    }
}
