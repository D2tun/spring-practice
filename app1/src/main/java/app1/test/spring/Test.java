package app1.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.test.spring.Interface.Music;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
		Music music = con.getBean("musicBean", Music.class);
		
		MusicPlayer mp = new MusicPlayer(music);
		
		mp.playMusic();
		
		con.close();
	}

}
