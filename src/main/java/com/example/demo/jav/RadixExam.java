package com.example.demo.jav;

public class RadixExam {

    public static void main(String[] args) {
        String binary = Integer.toBinaryString(32);
        String octal = Integer.toOctalString(32);
        String hex = Integer.toHexString(32);

        System.out.println("binary : " + binary);
        System.out.println("octal : " + octal);
        System.out.println("hex : " + hex);

        int binaryInt = Integer.parseInt(binary, 2);
        int octalInt = Integer.parseInt(octal, 8);
        int hexInt = Integer.parseInt(hex, 16);

        System.out.println(binaryInt);
        System.out.println(octalInt);
        System.out.println(hexInt);
    }
}
