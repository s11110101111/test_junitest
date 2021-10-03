package org.example.test_junitest.robot;

public class Robot {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int i = 1;
        RobotConnection robotConnection = null;

        try {
            i = 10;
            robotConnection = robotConnectionManager.getConnection();
            robotConnection.moveRobotTo(toX, toY);
            i = 5;
        } catch (RobotConnectionException e) {
            i = 11;
            throw new RobotConnectionException(e.getMessage(), e);
        } catch (Exception e1) {
            i = 12;
            throw new RobotConnectionException("");

        } finally {
            if (robotConnection != null) {
                try {
                    robotConnection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(i);

    }
}
