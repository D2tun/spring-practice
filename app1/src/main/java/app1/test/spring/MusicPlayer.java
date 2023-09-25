package app1.test.spring;

import java.util.ArrayList;
import java.util.List;

import app1.test.spring.Interface.Music;

public class MusicPlayer {

	private List<Music> musicList = new ArrayList<>();
	private int volume;
	private String name;
	
	public MusicPlayer(ArrayList musicList) {
		this.musicList = musicList;
	}

	public MusicPlayer() {};
	
	public void playMusic() {
		for (int i = 0; i < this.musicList.size(); ++i) {
			System.out.println("Playing: " + this.musicList.get(i).getSong());
		}
	}
	
	public void setMusicList(ArrayList<Music> musicList) {
		this.musicList = musicList;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Music> getMusicList() {
		return (ArrayList<Music>) this.musicList;
	}

	public int getVolume() {
		return volume;
	}

	public String getName() {
		return name;
	}
	
}
