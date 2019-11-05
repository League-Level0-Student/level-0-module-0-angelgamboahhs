package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class robotgraffiti {
	 public static void main(String[] args) {
		 Robot jj = new Robot();
		 jj.setSpeed(100);
         jj.penDown();
         for(int i=0;i<3;i ++) {          
        	 jj.move(100);
        	 jj.turn(90);
         }
            jj.turn(90);
            jj.move(50);
            jj.setSpeed(50);
        jj.turn(270);         
        jj.move(170);
	 }
	}

	 

