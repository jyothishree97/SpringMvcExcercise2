package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
//@Controller which can be used for URL mapping and invoking business logic
public class UserController {
    @RequestMapping("/")
//    The class-level annotation maps a specific request path or pattern onto a controller.
//    You can then apply additional method-level annotations to make mappings more specific to handler methods.
    public String login() {
        return "index";
    }

    @RequestMapping("/login")
    public ModelAndView welcomePage(){
        User user=new User();
        user.setUsername("jyothi");
        ModelAndView model=new ModelAndView("page");
        //The final interface to pass values to a view is the ModelAndView.
        model.addObject("name",user.getUsername());
        return model;
    }
}
