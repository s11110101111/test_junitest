package org.example.test_junitest.Spring_jdbc_transactional;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;


public class MailService  implements  IMailService{
    private String hostName;
    private String userName;
    private Integer port;

    public MailService(String hostName, String userName, Integer port) {
        this.hostName = hostName;
        this.userName = userName;
        this.port = port;
    }


    public void sendWelcomeEmail(User user) {
        //TODO send real email user here...
        System.out.println(ColorANSI.PURPLE.fillColor("Sending out welcome email to hostName = '"
        +hostName + ", port="+port +",\n to: "+ user.toString()));
    }
}
