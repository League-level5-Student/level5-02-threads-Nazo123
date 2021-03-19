package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
	
		Robot bob = new Robot(100,200);
		bob.setPenColor(Color.blue);
		bob.penDown();
		Robot test = new Robot(220,320);
		test.setPenColor(Color.yellow);
		test.penDown();
		Robot tet = new Robot(340,200);
		tet.setPenColor(Color.black);
		tet.penDown();
		Robot as = new Robot(460,320);
		as.setPenColor(Color.green);
		as.penDown();
		Robot er = new Robot(580,200);
		er.setPenColor(Color.red);
		er.penDown();
		Thread e = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				bob.move(2);
				bob.turn(1);
			}
		});
		Thread a = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				test.move(2);
				test.turn(1);
			}
		});
		Thread to = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				tet.move(2);
				tet.turn(1);
			}
		});
		Thread the = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				as.move(2);
				as.turn(1);
			}
		});
		Thread game = new Thread(()-> {
			for(int i = 0; i < 360; i++) {
				er.move(2);
				er.turn(1);
			}
		});
	e.start();
	a.start();
	to.start();
	the.start();
	game.start();
	}
}

