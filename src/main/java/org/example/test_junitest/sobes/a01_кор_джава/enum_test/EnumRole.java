package org.example.test_junitest.sobes.a01_кор_джава.enum_test;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

/**
 *
 */
@Getter
public enum EnumRole {
    NONE("-"),
    PARTNER("Сотрудник партнера"),
    PARTNER_ADMIN("Сотрудник админ"),
    BACK_OFF("Сотрудник"),
    PARTNER_KV("Сотрудник КВ"),
    PARTNER_AGREEMENT("Сотрудник договор");

    private static final Map<String, EnumRole> MAP_BY_VAL = new HashMap<>();

    static {
        for (EnumRole e : values()) {
            MAP_BY_VAL.put(e.val, e);
        }
    }

    private final String val;

    EnumRole(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public static EnumRole valueOfLabel(String label) {
        return MAP_BY_VAL.get(label);
    }

    @Override
    public String toString() {
        return getVal();
    }
}
