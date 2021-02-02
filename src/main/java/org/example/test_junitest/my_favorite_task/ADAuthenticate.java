package org.example.test_junitest.my_favorite_task;


import com.sun.security.auth.callback.TextCallbackHandler;
import lombok.SneakyThrows;

import javax.security.auth.login.LoginContext;
import java.util.logging.Logger;

public class ADAuthenticate {
    //this returns the logged in user if they're authenticated with the ldap server (Active Directory)
    @SneakyThrows
    public javax.security.auth.Subject getSubject() {
        String ldapServer = System.getenv("USERDNSDOMAIN");

        if (ldapServer == null) {
            System.err.println("No \"USERDNSDOMAIN\" environment variable found");
            return null;
        }

        System.setProperty("java.security.auth.login.config", "jaas.conf");
        System.setProperty("javax.security.auth.useSubjectCredsOnly", "true");

            LoginContext loginCtx = new LoginContext("Server", new TextCallbackHandler());
            loginCtx.login();
            return loginCtx.getSubject();


    }
}
    //and the contents of the jaas.conf file:

//    Server {
//        com.sun.security.auth.module.Krb5LoginModule required
//        useKeyTab=false
//        useTicketCache=true;
//    };
//    Share
//    Improve this answer
//            Follow
//}
