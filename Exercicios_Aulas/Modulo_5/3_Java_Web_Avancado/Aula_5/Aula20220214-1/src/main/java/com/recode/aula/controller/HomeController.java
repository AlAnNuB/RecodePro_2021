package com.recode.aula.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.aula.model.MensagemSimples;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public MensagemSimples acessar(){
        return new MensagemSimples("Status","Conexão efetuada com sucesso");
    }
    
    @GetMapping("index")
    public MensagemSimples acessar2(){
        return acessar();
    }
    
}

