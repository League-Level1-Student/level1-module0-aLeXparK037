package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffects implements ActionListener {
	JButton left = new JButton();
	JButton right = new JButton();
	String water = ("water.wav");
	String splat = ("splat.wav");
	public void sound() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		
		left.setText("one");
		
		right.setText("two");
		panel.add(left);
		panel.add(right);
		left.addActionListener(this);
		right.addActionListener(this);
	}
	public void soundOne(String yourFile) {
	try {
	    File yourFile1 = null;
	    AudioInputStream stream;
	    AudioFormat format;
	    DataLine.Info info;
	    Clip clip;

	    stream = AudioSystem.getAudioInputStream(yourFile1);
	    format = stream.getFormat();
	    info = new DataLine.Info(Clip.class, format);
	    clip = (Clip) AudioSystem.getLine(info);
	    clip.open(stream);
	    clip.start();
	}
	
	catch (Exception e) {
	    //whatevers
	
	}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == left) {
			soundOne(water);
		}
		if (e.getSource() == right) {
			soundOne(splat);
		}
	}

}
