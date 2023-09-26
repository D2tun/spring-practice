package app1v2.test.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class MusicPlayer {

	private Music music1;
	private Music music2;
	private int volume;
	private String name;
	@Autowired
	public MusicPlayer(@Qualifier("folkMusic") Music music, @Qualifier("rockMusic") Music music2) {
		this.music1 = music;
		this.music2 = music2;
	}

	public MusicPlayer() {};
	
	public String playMusic() {
		return "Playing: " + this.music1.getSong() + ", " + this.music2.getSong();
	}
	
	public void setMusic(Music music) {
		this.music1 = music;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Music getMusic() {
		return music1;
	}

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}
	
}
