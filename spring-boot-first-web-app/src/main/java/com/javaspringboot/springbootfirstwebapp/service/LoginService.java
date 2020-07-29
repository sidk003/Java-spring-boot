package com.javaspringboot.springbootfirstwebapp.service;

import org.springframework.stereotype.Component;

//Spring-Bean
@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		//dummy userid = siddhantk0305, password = asdf
		return userid.equalsIgnoreCase("siddhantk0305")&&password.equalsIgnoreCase("asdf");
	}
}
