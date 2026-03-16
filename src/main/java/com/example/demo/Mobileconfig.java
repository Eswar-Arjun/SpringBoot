 package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mobileconfig {	
	@Bean
	public Color getMobileColor() {
		return new Color();
	}
	@Bean
	public onePlus getOneplueObject(Color getMobileColor) {
		return new onePlus(getMobileColor);
	}
	@Bean
	public Mobiles getiPhoneObject() {
		return new iPhone();
	}
}
