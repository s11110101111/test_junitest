package org.example.test_junitest.sobes.bitwise_bit_shift_operators;

public class BitUtils {

    public static String intBinaryToString(int a) {
        String str;
        str = Integer.toBinaryString(a);

        String s = str.length()<32 ? String.format("%0" + (32 - str.length()) + "d%s", 0, str):str;

        return s.replaceAll("(\\d{8})(\\d{8})(\\d{8})(\\d{8})", "$1 $2 $3 $4");

    }
}
