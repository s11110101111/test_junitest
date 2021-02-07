package org.example.test_junitest.spring_framework.configs;

import org.example.test_junitest.spring_framework.sppring_потрошитель1.ITerminatorQuoter;
import org.example.test_junitest.spring_framework.sppring_потрошитель1.TerminatorQuoter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp1потрошитель {

@Bean (name="terminatorQuoter")
    public ITerminatorQuoter terminatorQuoter(){
    return new TerminatorQuoter();
}
}
