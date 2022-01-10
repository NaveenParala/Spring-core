package com.st.spring.core.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.st.spring.core.beans.interfaces.Ink;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BlueInk implements Ink {

	public String getBrandName() {
		return "Camlin";
	}

	public String getColor() {
		return "Blue";
	}

}
