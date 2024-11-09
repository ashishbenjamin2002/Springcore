package com.score.config_remove;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configration
@ComponentScan(basePackages=
public class javaConfig {
	@Bean
	publilc Person getPerson()
	{
		Person p1=new Person();
		return p1;
	}

}
