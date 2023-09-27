package app1v2.test.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
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
	
	@PostConstruct
	public void doInit() {
		System.out.println("initialization");
	}

	@PreDestroy
	public void doDestroy() {
		System.out.println("destruction");
	}
}
