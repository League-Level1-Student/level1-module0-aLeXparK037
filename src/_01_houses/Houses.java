package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot ap = new Robot("mini");
	static int height = 0;

	public static void main(String[] args) {
		ap.setX(100);
		ap.setY(500);
		ap.setSpeed(50);
		// String houseHeight = JOptionPane.showInputDialog("How tall should the houses
		// be?(small, medium, or large)");
		String houseColor = JOptionPane.showInputDialog("What color should the houses be?(red, green, or blue)");
		drawFlatHouse(houseColor);
		drawPointyHouse(houseColor);
		drawFlatHouse(houseColor);
		drawPointyHouse(houseColor);
		drawFlatHouse(houseColor);
		drawPointyHouse(houseColor);
		drawFlatHouse(houseColor);
		drawPointyHouse(houseColor);
	}

	public void run() {

	}

	static void drawFlatHouse(String colorColor) {
		for (int z = 0; z < 1; z++) {
			Random ran = new Random();
			int number = ran.nextInt(3);

			if (number == 0) {
				height = 60;
			} else if (number == 1) {
				height = 120;
			} else if (number == 2) {
				height = 250;
			}
			if (colorColor.equals("red")) {
				ap.penDown();
				ap.setPenColor(Color.RED);

				ap.move(height);
				ap.turn(90);
				ap.move(20);
				ap.turn(90);
				ap.move(height);
				ap.turn(-90);
				ap.setPenColor(Color.GREEN);
				ap.move(20);
				ap.turn(-90);

			} else if (colorColor.equals("green")) {

				ap.penDown();
				ap.setPenColor(Color.GREEN);

				ap.move(height);
				ap.turn(90);
				ap.move(20);
				ap.turn(90);
				ap.move(height);
				ap.turn(-90);
				ap.setPenColor(Color.GREEN);
				ap.move(20);
				ap.turn(-90);

			} else if (colorColor.equals("blue")) {

				ap.penDown();
				ap.setPenColor(Color.BLUE);

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

	static void drawPointyHouse(String colorColor) {
		for (int i = 0; i < 1; i++) {
			Random rans = new Random();
			int numbers = rans.nextInt(3);

			if (numbers == 0) {
				height = 60;
			} else if (numbers == 1) {
				height = 120;
			} else if (numbers == 2) {
				height = 250;
			}
			if (colorColor.equals("red")) {

				ap.penDown();
				ap.setPenColor(Color.RED);
				ap.move(height - 10);
				ap.turn(45);
				ap.move(10);
				ap.turn(90);
				ap.move(10);
				ap.turn(45);
				ap.move(height - 10);
				ap.turn(-90);
				ap.setPenColor(Color.GREEN);
				ap.move(20);
				ap.turn(-90);

			} else if (colorColor.equals("green")) {

				ap.penDown();
				ap.setPenColor(Color.GREEN);
				ap.move(height - 10);
				ap.turn(45);
				ap.move(10);
				ap.turn(90);
				ap.move(10);
				ap.turn(45);
				ap.move(height - 10);
				ap.turn(-90);
				ap.setPenColor(Color.GREEN);
				ap.move(20);
				ap.turn(-90);

			} else if (colorColor.equals("blue")) {

				ap.penDown();
				ap.setPenColor(Color.BLUE);
				ap.move(height - 10);
				ap.turn(45);
				ap.move(10);
				ap.turn(90);
				ap.move(10);
				ap.turn(45);
				ap.move(height - 10);
				ap.turn(-90);
				ap.setPenColor(Color.GREEN);
				ap.move(20);
				ap.turn(-90);

			}
		}
	}
}
