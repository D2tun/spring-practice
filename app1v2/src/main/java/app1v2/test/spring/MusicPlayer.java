package app1v2.test.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import app1v2.test.spring.Interface.Music;

@Component
public class MusicPlayer {

	private Music music1;
	private Music music2;
	private Music music3;
	@Value("${musicPlayer.volume}")
	private int volume;
	@Value("${musicPlayer.name}")
	private String name;
	@Autowired
	public MusicPlayer(@Qualifier("folkMusic") Music music, @Qualifier("rockMusic") Music music2, @Qualifier("classicMusic") Music music3) {
		this.music1 = music;
		this.music2 = music2;
		this.music3 = music3;
	}

	public MusicPlayer() {};
	
	public String playMusic(MusicGenres genre) {
		if (genre == MusicGenres.CLASSIC_MUSIC) {
			return ("Playing: " + this.music3.getSong()[new Random().nextInt(3)]);
		} else if (genre == MusicGenres.FOLK_MUSIC) {
			return "Playing: " + this.music1.getSong()[new Random().nextInt(3)];
		} else if (genre == MusicGenres.ROCK_MUSIC) {
			return ("Playing: " + this.music2.getSong()[new Random().nextInt(3)]);
		} else {
			return "";
		}
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
