package com.st.spring.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.st.spring.core.beans.interfaces.Ink;
import com.st.spring.core.beans.interfaces.Pen;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FountainPen implements Pen {
	
	private Ink ink;
	
	@Autowired
	public FountainPen(final Ink ink) {
		this.ink = ink;
	}
	
	public void write() {
		System.out.println("Writing with " + ink.getColor() + 
				" ink of " + ink.getBrandName() + " brand");
	}

}
