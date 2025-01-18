package com.example.demoWebClient.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/saludo")
public class MainController {

    @GetMapping("/hola")
    public String saludo(){
        return "hola";
    }



}
