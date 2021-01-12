package org.example.test_junitest.sobes.bitwise_bit_shift_operators;

import org.example.test_junitest.sobes.enum_test.ColorANSI;

public class MainBitApp {
    public static void main(String[] args) {
/*        int a = 1967;
        int b=15;
//        String str = "bin - " + Integer.toBinaryString(a) + "\n" +
//                "hex " + Integer.toHexString(a) + "\n" +
//                "ost " + Integer.toOctalString(a) + "\n" +
//                "unSign " + Integer.toUnsignedString(a) + "\n" +
//                "Sign -1,0,1 " + Integer.signum(a);
//        System.out.println(str);
        */
      int a = new String("color").hashCode();

        System.out.println(ColorANSI.YELLOW.fillColor(BitUtils.intBinaryToString(a)));

        int b = a>>>16;
        System.out.println(ColorANSI.YELLOW.fillColor(BitUtils.intBinaryToString(b)));
    }


}
