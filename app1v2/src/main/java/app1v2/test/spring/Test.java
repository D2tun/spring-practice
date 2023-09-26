package app1v2.test.spring;

import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1v2.test.spring.Interface.Music;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Music music = con.getBean("classicMusic", Music.class);
		Music music2 = con.getBean("folkMusic", FolkMusic.class);
		Music music3 = con.getBean("rockMusic", RockMusic.class);
		ArrayList mus = new ArrayList<Music>();
		mus.add(music);
		mus.add(music2);
		mus.add(music3);
		MusicPlayer mp = new MusicPlayer(mus);
		
		mp.playMusic();
		con.close();
	}

}
