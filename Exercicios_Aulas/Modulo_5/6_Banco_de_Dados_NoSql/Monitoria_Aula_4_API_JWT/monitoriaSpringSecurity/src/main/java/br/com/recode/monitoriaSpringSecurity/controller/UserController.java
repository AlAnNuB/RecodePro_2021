package br.com.recode.monitoriaSpringSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.recode.monitoriaSpringSecurity.model.RecodeUser;
import br.com.recode.monitoriaSpringSecurity.repository.RecodeUserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private RecodeUserRepository recodeUserRepository;
	
	@PostMapping
	public ResponseEntity<RecodeUser> save(@RequestBody RecodeUser recodeUser){
		try {
			PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
			recodeUser.setPassword(passwordEncoder.encode(recodeUser.getPassword()));
			recodeUserRepository.save(recodeUser);
			return ResponseEntity.ok().body(recodeUser);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;
	}
}
