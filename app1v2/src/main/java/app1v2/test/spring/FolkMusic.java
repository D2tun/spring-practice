package app1v2.test.spring;

import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class FolkMusic implements Music {

	@Override
	public String getSong() {
		return "Tamo daleko";
	}

}
