package org.example.test_junitest.hacker_rank_solutions.Tag_Content_Extractor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 */

class TagContentExtractorTest {


    @ParameterizedTest
    @CsvSource(value = {
        "test:test",
        "<h1>Nayeem loves counseling</h1>:Nayeem loves counseling",
        "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>:Sanjay has no watch So wait for a while",
        "<Amee>safat codes like a ninja</amee>:None",
        "<SA premium>Imtiaz has a secret crush</SA premium>:Imtiaz has a secret crush"
    }, delimiter = ':')
    void getTagContext(String tagInput, String expectedContext) {
        Assertions.assertThat(tagInput).isEqualTo(expectedContext);
    }
}