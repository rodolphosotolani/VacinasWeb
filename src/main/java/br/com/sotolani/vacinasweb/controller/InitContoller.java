package br.com.sotolani.vacinasweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InitContoller {

    @RequestMapping("/")
    @RequestBody
    public String init() {
        return "Hellow World";
    }
}
