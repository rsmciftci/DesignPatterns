package rsmciftci;

import rsmciftci.creationalpatterns.builder.third.OldRobotBuilder;
import rsmciftci.creationalpatterns.builder.third.Robot;
import rsmciftci.creationalpatterns.builder.third.RobotBuilder;
import rsmciftci.creationalpatterns.builder.third.RobotEnginner;

public class Main {
    public static void main(String[] args){

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEnginner robotEnginner = new RobotEnginner(oldStyleRobot);

        robotEnginner.makeRobot();

        Robot robot = robotEnginner.getRobot();

        System.out.println("Robot Built");
        System.out.println("Head: "+robot.getRobotHead());
        System.out.println("Arms: "+robot.getRobotArms());
        System.out.println("Legs: "+robot.getRobotLegs());
        System.out.println("Torso: "+robot.getRobotTorso());


    }
}



