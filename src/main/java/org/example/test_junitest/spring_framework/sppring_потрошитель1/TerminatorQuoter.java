package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import org.example.test_junitest.sobes.enum_test.ColorANSI;
import org.springframework.beans.factory.annotation.Value;

public class TerminatorQuoter implements ITerminatorQuoter {
    @InjectRandomInt(min = 2, max = 8)
    private int repit;

    private String message;

    public TerminatorQuoter() {
    }

    @Value("I'll be back!")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {

        for (int i = 0; i < repit; i++) {
            System.out.println(ColorANSI.YELLOW.fillColor(message));

        }
    }
}
