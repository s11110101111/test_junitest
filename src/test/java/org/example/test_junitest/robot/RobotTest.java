package org.example.test_junitest.robot;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RobotTest {

@Test
   public void getConnection(){
       RobotConnectionManager robotConnectionManager = null;
        Robot.moveRobot(robotConnectionManager,10,10);

    }

}