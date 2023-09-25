package app1.test.spring;

import app1.test.spring.Interface.Music;

public class RockMusic implements Music {

	@Override
	public String getSong() {
		return "Trial";
	}

}
