package app1v2.test.spring;

import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class FolkMusic implements Music {

	@Override
	public String[] getSong() {
		return new String[] {"Tamo daleko", "Czerwone jagody", "Was wollen wir trinken"};
	}

}
