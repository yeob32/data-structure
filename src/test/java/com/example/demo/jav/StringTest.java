package com.example.demo.jav;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @Test
    @DisplayName("문자열의 바이트 값 확인")
    public void check_char_byte() {
        assertEquals("1".getBytes().length, 1);
        assertEquals("a".getBytes().length, 1);
        assertEquals("허".getBytes().length, 3);
        assertEquals("!@#$%^&*()".getBytes().length, 10);
    }

    /**
     * 한글 3byte
     *
     * @param value
     */
    @ParameterizedTest
    @ValueSource(strings = "this is 111 허허허")
    public void sum_char_byte(String value) {
        int sum = value.chars()
                .map(v -> Character.toString(v).getBytes().length)
                .sum();

        byte[] bytes = value.getBytes();
        System.out.println(bytes.length);

        assertEquals(sum, bytes.length);
    }

    @Test
    @DisplayName("string pool 햑인")
    public void assign_string_process() {
        String a = "a";
        String b = "a";
        assertEquals(a, b);
        assertSame(a, b);

        String c = new String("a");
        assertEquals(c, b);
        assertEquals(c.intern(), b);
        assertNotSame(c, b);
        assertEquals(b.hashCode(), c.hashCode());
        assertNotSame(System.identityHashCode(b), System.identityHashCode(c));
        System.out.println(b.hashCode() + ", " + c.hashCode());
        System.out.println(System.identityHashCode(b) + ", " + System.identityHashCode(c));
    }
}
