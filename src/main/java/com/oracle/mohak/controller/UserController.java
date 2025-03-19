package com.oracle.mohak.controller;

import com.oracle.mohak.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping(value = "/info")
    public String showUserPage(Model model) {
        model.addAttribute("name","Sachin");
        model.addAttribute("iplTeam","MI");
        return "UserHome";
    }
    @GetMapping(value = "/obj")
    public String showUserObject(Model model) {

        List<User>list= List.of(new User(7,"Dhoni","Captain"),
                new User(22,"Shardul","Bowler"),
                new User(45,"Rohit","Batsmen"),
                new User(18,"Virat kohli","Batsmen"),
                new User(21,"Bumrah","bowler"));
        model.addAttribute("user",list);
        return "UserData";
    }
}
