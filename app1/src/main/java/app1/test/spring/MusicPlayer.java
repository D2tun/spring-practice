package app1.test.spring;

import app1.test.spring.Interface.Music;

public class MusicPlayer {

	private Music music;
	private int volume;
	private String name;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}

	public MusicPlayer() {};
	
	public void playMusic() {
		System.out.println("Playing: " + this.music.getSong());
	}

	public void setMusic(Music music) {
		this.music = music;
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
