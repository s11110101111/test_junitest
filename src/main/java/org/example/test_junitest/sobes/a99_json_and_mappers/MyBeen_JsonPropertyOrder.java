package org.example.test_junitest.sobes.a99_json_and_mappers;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

/**
 * есть тест
 */
@JsonPropertyOrder({"name", "id"})
@Getter
@Setter
public class MyBeen_JsonPropertyOrder {

    private int id;
    private String name;

    public MyBeen_JsonPropertyOrder(int i, String name) {
        this.id = i;
        this.name = name;
    }
}
