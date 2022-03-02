package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

 //@annotates the class with the @controller stereotype annotation
public class HomeController {

    @RequestMapping("/home") // use @request mapping annotation to associate the action with an HTTP path
    public String home(){
        return"home.html"; // return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return"welcome.html";
    }

    @RequestMapping
    public String welcome1(){
        return"welcome.html";
    }
}
