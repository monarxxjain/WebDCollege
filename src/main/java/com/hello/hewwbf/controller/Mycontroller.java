package com.hello.hewwbf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hello.hewwbf.Model.UserData;
import com.hello.hewwbf.Service.UserServiceImpl;

@Controller
public class Mycontroller {

    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @GetMapping("/")
    public String akshatMap(Model model) {
        return "akshat";
    }
    
    @GetMapping("/akshat1") 
    public String akshat1Map(Model model) {
        return "akshat1";
    }
    
    @GetMapping("/index")
    public String rootMap(Model model) {
        // model.addAttribute("username", "Monark Jain");
        return "index";
    }

    @GetMapping("/gallery") 
    public String galleryMap(Model model) {
        return "gallery";
    }

    @GetMapping("/gallery/estrella") 
    public String estrellaMap(Model model) {
        return "estrella";
    }

    @GetMapping("/gallery/zephyr") 
    public String zephyrMap(Model model) {
        return "zephyr";
    }

    @GetMapping("/gallery/afterdark") 
    public String afterdarkMap(Model model) {
        return "afterdark";
    }

    @GetMapping("/gallery/goonj") 
    public String goonjMap(Model model) {
        return "goonj";
    }

    @GetMapping("/gallery/utkrisht") 
    public String utkrishtMap(Model model) {
        return "utkrisht";
    }

    @GetMapping("/gallery/crotonia") 
    public String crotoniaMap(Model model) {
        return "gallery";
    }

    @GetMapping("/aboutus") 
    public String aboutMap(Model model) {
        return "aboutus";
    }

    @GetMapping("/contactus") 
    public String contactMap(Model model) {
        return "contactus";
    }

    @PostMapping("/post/form")
    public void postForm(@RequestBody UserData userData){
        this.userServiceImpl.postData(userData);
    }


    @GetMapping("/alumni")
    public String alumniMap(Model model) {
        return "alumni";
    }

    @GetMapping("/get/users")
    public List<UserData> getData(){
        return this.userServiceImpl.getall();
    }
    
}
