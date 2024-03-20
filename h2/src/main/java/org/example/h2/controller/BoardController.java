package org.example.h2.controller;

import org.example.h2.entity.Board;
import org.example.h2.service.BoardService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // 컨트롤러임을 인지시킴
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // 127.0.0.1:8090/board/write
    public String boardWriteForm(){

        return "shop";
    }
}
