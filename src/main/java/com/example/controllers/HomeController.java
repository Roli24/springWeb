package com.example.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.beans.Login;
import com.example.beans.User;

@Controller
public class HomeController {
	
	@GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }

    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("going to Search page");
        return "search";
    }
    
    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to login page");
        return "login";
    }
    
    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("going to Registration page");
        return "register";
    }
    
  
    

}
