package com.st.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.st.spring.core.beans.interfaces.Ink;
import com.st.spring.core.beans.interfaces.Pen;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FountainPen implements Pen {
	
	private Ink ink;
	
	public void write() {
		System.out.println("Writing with " + ink.getColor() + 
				" ink of " + ink.getBrandName() + " brand");
	}

	public Ink getInk() {
		return ink;
	}

	@Autowired
	@Qualifier("blackInk")
	public void setInk(Ink ink) {
		this.ink = ink;
	}

}
