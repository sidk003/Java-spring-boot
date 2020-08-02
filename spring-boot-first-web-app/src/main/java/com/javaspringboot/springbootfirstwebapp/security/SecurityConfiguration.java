package com.javaspringboot.springbootfirstwebapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	//Create -User - siddhant/asdf
	
	@Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        	auth.inMemoryAuthentication()
        		.passwordEncoder(NoOpPasswordEncoder.getInstance())
        		.withUser("siddhant").password("asdf")
                .roles("USER", "ADMIN");
    }
}
