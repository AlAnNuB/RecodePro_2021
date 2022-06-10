package br.com.recode.monitoriaSpringSecurity.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.recode.monitoriaSpringSecurity.model.RecodeUser;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	
	
	private AuthenticationManager authenticationManager;
	
	private JWTUtil jwtUtil;
	
	public JWTAuthenticationFilter(AuthenticationManager authenticationManager, JWTUtil jwtUtil) {
		this.authenticationManager = authenticationManager;
		this.jwtUtil = jwtUtil;
	}

	@Override
	public Authentication attemptAuthentication(
			HttpServletRequest request, 
			HttpServletResponse response)
			throws AuthenticationException {
		try {
			RecodeUser user = new ObjectMapper()
					.readValue(request.getInputStream(), RecodeUser.class);
			
			UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(), new ArrayList<>());
			Authentication auth = authenticationManager.authenticate(authToken);
			return auth;
			
		}catch(IOException e) {
			throw new RuntimeException(e);
		}

	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest req,
            HttpServletResponse res,
            FilterChain chain, Authentication auth) throws IOException, ServletException{
		String username = ((RecodeUser) auth.getPrincipal()).getUsername();
		System.out.println("user " + username);
		String token = jwtUtil.generateToken(username);
		System.out.println("token " + token);
		res.addHeader("Authorization", "Bearer " + token);
		res.addHeader("access-control-expose-headers", "Authorization");
	}
	
}
