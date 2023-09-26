package app1v2.test.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class MusicPlayer {

	private ClassicMusic music;
	private FolkMusic music2;
	private int volume;
	private String name;
	@Autowired
	public MusicPlayer(ClassicMusic music, FolkMusic musik2) {
		this.music = music;
		this.music2=musik2;
	}

	public MusicPlayer() {};
	
	public String playMusic() {
		return "Playing: " + this.music.getSong();
		//System.out.println("Playing: " + this.music2.getSong());
	}
	

	public void setMusic(Music music) {
		this.music = (ClassicMusic) music;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Music getMusic() {
		return music;
	}

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}
	
}
