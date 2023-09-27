package app1v3.test.spring.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import app1v3.test.spring.ClassicMusic;
import app1v3.test.spring.Computer;
import app1v3.test.spring.FolkMusic;
import app1v3.test.spring.MusicPlayer;
import app1v3.test.spring.RockMusic;
import app1v3.test.spring.Interface.Music;

@Configuration
//@ComponentScan("app1v3.test.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	
	@Bean
	public ClassicMusic classicMusic() {
		return new ClassicMusic();
	}
	
	@Bean
	public FolkMusic folkMusic() {
		return new FolkMusic();
	}

	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	
	@Bean
	public ArrayList<Music> musicList() {
		ArrayList<Music> music = new ArrayList<>();
		music.add(classicMusic());
		music.add(folkMusic());
		music.add(rockMusic());
		return music;
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(musicList());
	}
	
	@Bean
	public Computer computer() {
		return new Computer(musicPlayer());
	}
}
