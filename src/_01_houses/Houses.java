package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot ap = new Robot("mini");
	public static void main(String[] args) {
		ap.setX(100);
		ap.setY(500);
		ap.setSpeed(50);
		String houseHeight = JOptionPane.showInputDialog("How tall should the houses be?");
		
		drawFlatHouse(houseHeight);
	}
	public void run() {
	
	}
	static void drawFlatHouse(String heightHeight) {
		int height = 0;	
		if (heightHeight.equals("small")) {
			height = 60;
		} else if (heightHeight.equals("medium")) {
			height = 120;
		} else if (heightHeight.equals("large")) {
			height = 250;
		}
		for (int z = 0; z < 10; z++) {
		ap.setRandomPenColor();
		ap.penDown();
		ap.move(height);
		ap.turn(90);
		ap.move(20);
		ap.turn(90);
		ap.move(height);
		ap.turn(-90);
		ap.setPenColor(Color.GREEN);
		ap.move(20);
		ap.turn(-90);
		}
}
}
