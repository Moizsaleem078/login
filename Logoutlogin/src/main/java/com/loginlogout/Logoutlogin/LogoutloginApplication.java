package com.loginlogout.Logoutlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogoutloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogoutloginApplication.class, args);
		myclass m=new myclass();
	    myclass.getmy();
	}

}
