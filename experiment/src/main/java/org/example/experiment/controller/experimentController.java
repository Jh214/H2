package org.example.experiment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class experimentController {
    @GetMapping("/study/main") // 127.0.0.1:8091/study/main
    public String boardWriteForm(){

        return "shop";
    }
}