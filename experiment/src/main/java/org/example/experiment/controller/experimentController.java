package org.example.experiment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class experimentController {
    @GetMapping("/study/main") // 127.0.0.1:8091/study/main
    public String LearningMainForm(){

        return "shop";
    }
    @PostMapping("/study/experimentpro")
    public String experimentPro(Model model){

        model.addAttribute("searchUrl", "/study/login");

        return "searchURL";
    }
    @GetMapping("/study/login")
    public String loginPage(){

        return "logIn";
    }
    @GetMapping("/study/sginup")
    public String sginupPage(){

        return "sginUp";
    }
}
