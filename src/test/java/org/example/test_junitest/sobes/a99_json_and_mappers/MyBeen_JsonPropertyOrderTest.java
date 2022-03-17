package org.example.test_junitest.sobes.a99_json_and_mappers;

import static org.assertj.core.api.Java6Assertions.assertThat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 *
 */

class MyBeen_JsonPropertyOrderTest {

    private static final Logger LOG = LoggerFactory.getLogger(MyBeen_JsonPropertyOrderTest.class);

    @Test
    public void whenSerializingUsingJsonPropertyOrder_thenCorrect() throws JsonProcessingException {
        MyBeen_JsonPropertyOrder been = new MyBeen_JsonPropertyOrder(1, "MyBean");
        String result = new ObjectMapper().writeValueAsString(been);
        LOG.info(() -> "====" + result);
        assertThat(result.contains("MyBean")).isTrue();
        assertThat(result).contains("1");

    }

}