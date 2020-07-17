package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String cherry = ("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2018%2F03%2Fblossoms-JCBUPDATE0318.jpg&q=85");

		// 2. create a variable of type "Component" that will hold your image
		Component ap;

		// 3. use the "createImage()" method below to initialize your Component
		ap = createImage(cherry);
		
		// 4. add the image to the quiz window
		quizWindow.add(ap);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		

		// 6. ask a question that relates to the image
		String one = JOptionPane.showInputDialog("Is this a good image?");

		// 7. print "CORRECT" if the user gave the right answer
		if (one.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Correct");
		} else if (one.equals("no")) {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(ap);
		// 10. find another image and create it (might take more than one line
		// of code)
		String waterfall = ("https://travelspassion.com/wp-content/uploads/2019/07/12-Most-Beautiful-Waterfalls-in-World-1.jpg");
		Component aps;
		aps = createImage(waterfall);
		quizWindow.add(aps);
		quizWindow.pack();

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
		String two = JOptionPane.showInputDialog("Is this a better image?");
		if (two.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Incorrect");
			} else if (two.equals("no")) {
				JOptionPane.showMessageDialog(null, "Correct");
			}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
