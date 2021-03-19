package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static boolean noWiner = true;
	public static void main(String[] args) {
	Robot[] arr = {new Robot(100,700), new Robot(200,700), new Robot(300,700), new Robot(400,700), new Robot(500,700)};
	Thread a = new Thread(()->{
		while(AdvancedRobotRace.noWiner) {
		Random r = new Random();
		arr[0].setSpeed(r.nextInt(3)+1);
		arr[0].move(r.nextInt(50));
		if(arr[0].getY()<250&&noWiner) {
			noWiner = false;
			arr[0].move(200);
		}
		}
	});
	Thread b = new Thread(()->{
		while(AdvancedRobotRace.noWiner) {
		Random r = new Random();
		arr[1].setSpeed(r.nextInt(3)+1);
		arr[1].move(r.nextInt(50));
		if(arr[1].getY()<250&&noWiner) {
			noWiner = false;
			arr[1].move(200);
		}
		}
	});
	Thread c = new Thread(()->{
		while(AdvancedRobotRace.noWiner) {
		Random r = new Random();
		arr[2].setSpeed(r.nextInt(3)+1);
		arr[2].move(r.nextInt(50));
		if(arr[2].getY()<250&&noWiner) {
			noWiner = false;
			arr[2].move(200);
		}
		}
	});
	Thread d = new Thread(()->{
		while(AdvancedRobotRace.noWiner) {
		Random r = new Random();
		arr[3].setSpeed(r.nextInt(3)+1);
		arr[3].move(r.nextInt(50));
		if(arr[3].getY()<250&&noWiner) {
			noWiner = false;
			arr[3].move(200);
		}
		}
	});
	Thread e = new Thread(()->{
		while(AdvancedRobotRace.noWiner) {
		Random r = new Random();
		arr[4].setSpeed(r.nextInt(3)+1);
		arr[4].move(r.nextInt(50));
		if(arr[4].getY()<250&&noWiner) {
			noWiner = false;
			arr[4].move(200);
			
		}
		}
	});
	a.start();
	b.start();
	c.start();
	d.start();
	e.start();

}
}
//1. make a main method

//2. create an array of 5 robots.

//3. use a for loop to initialize the robots.

	//4. make each robot start at the bottom of the screen, side by side, facing up

//5. use another for loop to iterate through the array and make each robot move 
//   a random amount less than 50.

//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

//7. declare that robot the winner and throw it a party!

//8. try different races with different amounts of robots.

//9. make the robots race around a circular track.