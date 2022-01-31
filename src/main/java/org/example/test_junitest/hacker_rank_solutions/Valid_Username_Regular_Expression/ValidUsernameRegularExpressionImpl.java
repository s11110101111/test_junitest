package org.example.test_junitest.hacker_rank_solutions.Valid_Username_Regular_Expression;

public class ValidUsernameRegularExpressionImpl implements ValidUsernameRegularExpression {
    @Override
    public String validateName(String userName) {
        String regex = "^[a-zA-Z]\\w{7,29}$";
        if (userName.matches(regex)) {
            return "Valid";
        }
        return "Invalid";
    }
}
