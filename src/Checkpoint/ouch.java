package Checkpoint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ouch implements ActionListener, KeyListener {
	JButton one = new JButton();
	JButton two = new JButton();
	JFrame frame = new JFrame();
public void buttons() {

frame.setVisible(true);
JPanel panel = new JPanel();
frame.add(panel);
one.setText("one");
two.setText("two");
panel.add(one);
panel.add(two);
one.addActionListener(this);
two.addActionListener(this);
frame.addKeyListener(this);
frame.requestFocus();
frame.pack();
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == one) {
		speak("Ouch");
	}
	if (e.getSource() == two) {
		speak("Ouch Ouch");
	}
	frame.requestFocus();
	}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
	
}

