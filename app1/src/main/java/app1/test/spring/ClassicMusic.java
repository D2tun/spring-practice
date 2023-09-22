package app1.test.spring;

import app1.test.spring.Interface.Music;

public class ClassicMusic implements Music {

	@Override
	public String getSong() {
		return "Hungarian rapsody";
	}

}
