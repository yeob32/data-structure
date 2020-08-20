package com.example.demo.structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.EmptyStackException;

public class StackTest {

    @Test
    public void simpleTest() {
        Stack<String> stack = new Stack<>();
        stack.push("t1");
        stack.push("t2");
        stack.push("t3");
        stack.push("t4");

        Assertions.assertEquals(stack.size(), 4);
        Assertions.assertEquals(stack.peek(), "t4");
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(stack.pop(), "t4");
        Assertions.assertEquals(stack.peek(), "t3");

        Assertions.assertEquals(stack.size(), 3);

        stack.pop();
        stack.pop();
        stack.pop();

        Assertions.assertEquals(stack.size(), 0);
        Assertions.assertTrue(stack.isEmpty());

        Assertions.assertThrows(EmptyStackException.class, stack::pop);
    }

    @ParameterizedTest
    @ValueSource(strings = {"[{{}}]"})
    public void sol1(String value) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (int i = value.length()-1; i >= 0; i--) {
            stack.push(value.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(stack.iterator().hasNext()) {
            stringBuilder.append(stack.pop());
        }

        Assertions.assertEquals(stringBuilder.toString(), value);
    }
}
