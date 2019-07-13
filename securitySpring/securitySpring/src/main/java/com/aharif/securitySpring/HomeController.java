package com.aharif.securitySpring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/hello")
    public String displayHello() {


        return "hello";
    }


    @GetMapping(value = "/")
    public String displayIndex() {


        return "index";
    }
    @GetMapping(value = "/home")
    public String displayHome() {


        return "home";
    }


    @GetMapping(value = "/login")
    public String displayLogin() {


        return "login";
    }

    @GetMapping(value = "/student")
    public String displayStudent() {


        return "student";
    }

}
