package MusicLoader;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class MusicLoader {
	public static File sound;
	public static float value;
	Clip clip;
	
	
	public MusicLoader() {
		
		value = -32.5f;
		
	}
	
	public void load() {
		sound = new File ("C:\\Users\\Legion\\git\\glamazon02\\glamazon02\\Glamazon02\\bin\\login02.wav");
	}
	
	public void play(File sound) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(value);
			
			clip.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
