package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackinthebox implements ActionListener  {
	JButton buttons = new JButton();
	int timesclicked = 0;
	String jack = ("jackInTheBox.png");
	String sound = ("hoomer-woohoo.wav");
public void suprise() {
	JFrame frames = new JFrame();
	frames.setVisible(true);
	buttons.setText("CLICK HERE");
	frames.add(buttons);
	buttons.addActionListener(this);
}

private void showPicture(String fileName) { 
     try {
          JLabel imageLabel = createLabelImage(fileName);
          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(imageLabel);
          frame.setVisible(true);
          frame.pack();
     } catch (Exception e) {
          e.printStackTrace();
     }
}

private JLabel createLabelImage(String fileName) {
     try {
          URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
          } else {
               Icon icon = new ImageIcon(imageURL);
               JLabel imageLabel = new JLabel(icon);
               return imageLabel;
          }
     } catch (Exception e) {
          System.err.println("Could not find image " + fileName);
          return new JLabel();
     }
}
private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == buttons) {
		timesclicked += 1;
	}
	if (timesclicked % 5 == 0) {
		showPicture(jack);
		createLabelImage(jack);
		playSound(sound);
	}
	
}
	
	
}

