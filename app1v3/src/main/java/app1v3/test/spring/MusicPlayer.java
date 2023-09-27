package app1v3.test.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import app1v3.test.spring.Interface.Music;

@Component
public class MusicPlayer {

	//@Autowired
	//@Qualifier("folkMusic")
	private List<Music> music = new ArrayList<>();
	@Value("${musicPlayer.volume}")
	private int volume;
	@Value("${musicPlayer.name}")
	private String name;
	
	public MusicPlayer(ArrayList<Music> music) {
		this.music = music;
	}

	public MusicPlayer() {};
	
	public String playMusic() {
		return this.name + " " + this.volume + " Playing: " + this.music.get(new Random().nextInt(3)).getSong();
	}
	
	public void setMusic(ArrayList<Music> music) {
		this.music = music;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Music> getMusic() {
		return this.music;
	}

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}
	
}
