package org.example.test_junitest.sobes.bitwise_bit_shift_operators;

public class MainBitApp {
    public static void main(String[] args) {
        int a = 1967;
        int b=15;
        String str = "bin - " + Integer.toBinaryString(a) + "\n" +
                "hex " + Integer.toHexString(a) + "\n" +
                "ost " + Integer.toOctalString(a) + "\n" +
                "unSign " + Integer.toUnsignedString(a) + "\n" +
                "Sign -1,0,1 " + Integer.signum(a);
        System.out.println(str);
        printBinary(a);

        int bitmask = 0x000F;
        int val = 0x2222;

        // prints "2"

        System.out.println(val & bitmask);
    }

    private static void printBinary(int a) {
        String str;
        str = Integer.toBinaryString(a);

        String s = str.length()<32 ? String.format("%0" + (32 - str.length()) + "d%s", 0, str):str;

        System.out.println(s.replaceAll("(\\d{8})(\\d{8})(\\d{8})(\\d{8})", "$1 $2 $3 $4"));
    }
}
