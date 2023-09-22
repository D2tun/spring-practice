package app1.test.spring;

import app1.test.spring.Interface.Music;

public class MusicPlayer {

	private Music music;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + this.music.getSong());
	}
	
}
