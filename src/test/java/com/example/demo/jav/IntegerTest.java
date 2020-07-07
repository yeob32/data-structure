package com.example.demo.jav;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerTest {

    @Test
    @DisplayName("정수 진수 변환 테스트")
    public void radix_example() {
        String binary = Integer.toBinaryString(8);
        String octal = Integer.toOctalString(8);
        String hex = Integer.toHexString(8);

        assertEquals(binary, "1000");
        assertEquals(octal, "10");
        assertEquals(hex, "8");

        int binaryInt = Integer.parseInt(binary, 2);
        int octalInt = Integer.parseInt(octal, 8);
        int hexInt = Integer.parseInt(hex, 16);

        assertEquals(binaryInt, 8);
        assertEquals(octalInt, 8);
        assertEquals(hexInt, 8);
    }
}
