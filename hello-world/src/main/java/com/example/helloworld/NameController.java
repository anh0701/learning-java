package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameController {
    @GetMapping("/")
    public String GetName(Model model){
        model.addAttribute( "name", "hello world");
        return "test";
    }
}
