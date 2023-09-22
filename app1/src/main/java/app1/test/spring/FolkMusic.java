package app1.test.spring;

import app1.test.spring.Interface.Music;

public class FolkMusic implements Music {

	@Override
	public String getSong() {
		return "Tamo daleko";
	}

}
