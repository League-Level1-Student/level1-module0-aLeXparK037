package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortunecookie implements ActionListener {
	JButton button = new JButton();

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);

		button.setText("Your fortune is here");
		frame.add(button);

		button.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WooHoo");
		if (e.getSource() == button) {
			Random ran = new Random();
			int number = ran.nextInt(5);
			if (number == 0) {
			JOptionPane.showMessageDialog(null, "you will soon be betrayed by your friend");
			} else if (number == 1) {
				JOptionPane.showMessageDialog(null, "Chrsitmas will come early for you");

			} else if (number == 2) {
				JOptionPane.showMessageDialog(null, "A friend will give you a cookie today");

			} else if (number == 3) {
				JOptionPane.showMessageDialog(null, "You will die the same way your great great great great grandpa did");

			} 
			else {
				JOptionPane.showMessageDialog(null, "I'am afraid I can't see your future, it is to dark.");
			}
		}

	}

}
