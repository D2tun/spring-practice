package app1v2.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private int id;
	private MusicPlayer musicPlayer;
	
	@Autowired
	public Computer(MusicPlayer musicPlayer) {
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString() {
		return "Coputer [id=" + id + ", musicPlayer=" + musicPlayer.playMusic(MusicGenres.CLASSIC_MUSIC) + "]";
	}

}
