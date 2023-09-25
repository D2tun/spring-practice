package app1.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app1.test.spring.Interface.Music;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Music music = con.getBean("musicBean", Music.class);
		
		MusicPlayer mp = con.getBean("musicPlayer", MusicPlayer.class);
/*		MusicPlayer mp2 = con.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(mp == mp2);
		mp2.setVolume(10);
		System.out.println(mp);
		System.out.println(mp2);*/
		
		System.out.println(mp.getName());
		System.out.println(mp.getVolume());
		
		mp.playMusic();
		con.close();
	}

}
