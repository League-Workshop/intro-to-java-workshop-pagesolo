import org.jointheleague.graphical.robot.Robot;

public class Graffitti {
public static void main(String[] args) {
	
	
	Robot e = new Robot("batman");
	e.setSpeed(255);
	e.penDown();
	e.move(65);
	e.turn(90);
	e.move(50);
	e.turn(90);
	e.move(15);
	e.turn(90);
	e.move(30);
	e.turn(-90);
	e.move(10);
	e.turn(-90);
	e.move(30);
	e.turn(90);
	e.move(15);
	e.turn(90);
	e.move(30);
	e.turn(-90);
	e.move(10);
	e.turn(-90);
	e.move(30);
	e.turn(90);
	e.move(15);
	e.turn(90);
	e.move(50);
	e.penUp();
	e.move(4000);
	
}
}
