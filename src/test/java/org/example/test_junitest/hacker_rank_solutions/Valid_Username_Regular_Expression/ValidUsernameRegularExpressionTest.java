package org.example.test_junitest.hacker_rank_solutions.Valid_Username_Regular_Expression;

import org.example.test_junitest.test_helper.TestHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Valid Username Regular Expression task.")
class ValidUsernameRegularExpressionTest {
    private final ValidUsernameRegularExpression vunre = TestHelper.getInstance(ValidUsernameRegularExpression.class);
    @ParameterizedTest
    @CsvSource( {
            "Julia, Invalid",
            "Samantha, Valid",
            "Samantha_21, Valid",
            "1Samantha, Invalid",
            "Samantha?10_2A, Invalid",
            "JuliaZ007, Valid",
            "Julia@007, Invalid",
            "_Julia007, Invalid"
    })

    void validateName(String input,String result) {
      assertThat(vunre.validateName(input)).isEqualTo(result);
    }
}