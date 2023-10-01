package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NameController {
    @Autowired
    private NameService nameService;
    @GetMapping("/name")
    public String GetName(Model model){
        model.addAttribute( "name", "hello world");
        return "test";
    }

    @PostMapping("/add-name")
    public String addList(@ModelAttribute NameModel nameModel){
        nameService.addName(nameModel);
        return "redirect:/";
    }
    @GetMapping("/")
    public String getAllList(Model model){
        model.addAttribute("names", nameService.getAll());
        model.addAttribute("newName", new NameModel());
        return "test";
    }
}
