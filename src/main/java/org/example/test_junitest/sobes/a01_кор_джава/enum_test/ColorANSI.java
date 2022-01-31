package org.example.test_junitest.sobes.a01_кор_джава.enum_test;


public enum ColorANSI {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN ("\u001B[36m"),
    WHITE("\u001B[37m");

    private String color;
    ColorANSI(String code){
        color = code;
    }

    public String getColor() {
        return color;
    }
    public String fillColor(String message){

        return getColor() + message +RESET.getColor();
    }
    public void printLn(String message){
        System.out.println(getColor() + message +RESET.getColor());
    }
}
