package app1v3.test.spring;

import org.springframework.stereotype.Component;

import app1v3.test.spring.Interface.Music;

//@Component
public class ClassicMusic implements Music {

	public ClassicMusic() {
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
