package com.recode.aula.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class ConfigSeguranca extends WebSecurityConfigurerAdapter {

	/** Usuários na memória
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user
                = User.builder()
                      .username("usu2")
                      .password(passwordEncoder().encode("1234"))
                      .roles("USER")
                      .build();

        return new InMemoryUserDetailsManager(user);
    }
    */
	
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
        		.antMatchers("/", "/index", "/user").permitAll()
        		.anyRequest().authenticated()
        		.and()
        	.httpBasic();
        http.csrf().disable();
        http.cors();
    }
    
}

