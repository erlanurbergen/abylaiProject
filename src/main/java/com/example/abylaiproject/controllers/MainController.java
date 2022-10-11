package com.example.abylaiproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class MainController {
    // HTTP - hyper text transfer protocol
    /*
    * get - обычно это запросы которые не изменяют базу данных
    * post - войти в базу данных(сохранить или удалить)
    * patch - изменение
    * put - изменение
    * delete - удалание
    * */
    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }
}
