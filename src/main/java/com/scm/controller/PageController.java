package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class PageController {

@RequestMapping("/home")
 public String home( Model model){

   //sending data to view
    System.out.println("Home page Handler");
    model.addAttribute("name", "Substring Technology");
    model.addAttribute("youtubeChannel", "Learn With Sneha");
    model.addAttribute("githubRepo", "https://github.com/Sneha5199");
    return "home";
 }
 //about route
 @RequestMapping("/about")
 public String aboutPage(Model model) {
   model.addAttribute("isLogin", true);
  System.out.println("About Page Loading");
     return "about";
 }
 
//services
@RequestMapping("/services")
public String servicesPage() {
 System.out.println("Services Page Loading");
    return "services";
}
}
