package com.recode.aula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.aula.model.MensagemSimples;
import com.recode.aula.model.User;
import com.recode.aula.model.Users;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Users usersDAO;

    @Bean
    public PasswordEncoder userPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }	
	
    @GetMapping
    public MensagemSimples acessar() {
    	return new MensagemSimples("acesso", "Sem problemas no GET");
    }
    
    
	@PostMapping
	public User salvar(@RequestBody User user) {
		user.setPassword(
				userPasswordEncoder().encode(user.getPassword()));
		return usersDAO.save(user);
	}

}
