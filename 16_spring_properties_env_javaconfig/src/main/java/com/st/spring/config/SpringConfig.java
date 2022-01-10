package com.st.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.st.spring.core.beans.BlackInk;
import com.st.spring.core.beans.FountainPen;
import com.st.spring.core.beans.Writer;
import com.st.spring.core.beans.interfaces.Ink;
import com.st.spring.core.beans.interfaces.Pen;

@Configuration
@PropertySource("classpath:sample.properties")
public class SpringConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public Writer writer(Pen pen) {
		return new Writer(pen);
	}
	
	@Bean
	public Pen fountainPen(Ink ink) {
		return new FountainPen(ink);
	}
	
	@Bean
	public Ink blackInk() {
		String brandName  = environment.getProperty("blackink.brand");
		String color  = environment.getProperty("blackink.color");
		return new BlackInk(brandName, color);
	}

}
