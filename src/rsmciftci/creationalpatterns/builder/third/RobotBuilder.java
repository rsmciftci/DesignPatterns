package rsmciftci.creationalpatterns.builder.third;

public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();

    Robot getRobot();
}
