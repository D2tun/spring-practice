package app1.test.spring;

import app1.test.spring.Interface.Music;

public class ClassicMusic implements Music {

	private ClassicMusic() {
	}
	
	public static ClassicMusic getClassicMusic() {
		return new ClassicMusic();
	}
	
	@Override
	public String getSong() {
		return "Hungarian rapsody";
	}
	
	public void doInit() {
		System.out.println("initialization");
	}

	public void doDestroy() {
		System.out.println("destruction");
	}
}
