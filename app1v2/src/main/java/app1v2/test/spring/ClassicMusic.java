package app1v2.test.spring;

import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class ClassicMusic implements Music {

	private ClassicMusic() {
	}
	
	public static ClassicMusic getClassicMusic() {
		return new ClassicMusic();
	}
	
	@Override
	public String[] getSong() {
		return new String[] {"Hungarian rapsody", "Habanera", "Вальс цветов"};
	}
	
	public void doInit() {
		System.out.println("initialization");
	}

	public void doDestroy() {
		System.out.println("destruction");
	}
}
