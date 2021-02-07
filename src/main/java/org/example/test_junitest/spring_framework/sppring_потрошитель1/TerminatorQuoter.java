package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import org.example.test_junitest.sobes.enum_test.ColorANSI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;

@Profiling
public class TerminatorQuoter implements ITerminatorQuoter {
    @InjectRandomInt(min = 2, max = 8)
    private int repit;

    private String message;


    @Override
    public void init(){

        message = "Phasa - 2 " + message + ColorANSI.GREEN.fillColor(" Init method or.");
        System.out.println(message + "\nrepit = "+repit);
    }
    public TerminatorQuoter() {
        System.out.println("=== Phase 1  - construct terminator" + "\nrepit = "+repit  );
    }

    @Value("I'll be back!")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println(getClass().getSimpleName());
        for (int i = 0; i < repit; i++) {
            System.out.println(ColorANSI.YELLOW.fillColor(message));

        }
    }
}
