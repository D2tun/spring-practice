package app1v3.test.spring;

import org.springframework.stereotype.Component;

import app1v3.test.spring.Interface.Music;

//@Component
public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Trial";
	}

}
