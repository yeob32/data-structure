package com.example.demo.structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class LinkedListTest {

    private static final Logger log = LoggerFactory.getLogger(LinkedListTest.class);

    final SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    final int fix = 10000000;

    @BeforeEach
    public void setUp() {

    }

    void batch() {
        long start = System.currentTimeMillis();
        IntStream.range(0, fix).forEach(singlyLinkedList::add);
        long end = System.currentTimeMillis();

        Assertions.assertEquals(singlyLinkedList.size(), fix);
        log.info(String.format("size: %s, ps : %sms", singlyLinkedList.size(), end - start));
    }

    @Test
    public void get1() {
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(4);
        Assertions.assertEquals(singlyLinkedList.get(0), 1);
        Assertions.assertEquals(singlyLinkedList.get(1), 2);
        Assertions.assertEquals(singlyLinkedList.get(2), 3);
        Assertions.assertEquals(singlyLinkedList.get(3), 4);
    }

    @Test
    public void get() {
        batch();

        long start = System.currentTimeMillis();
        int value = (int) singlyLinkedList.get(fix - 2);
        long end = System.currentTimeMillis();

        log.info(String.format("value: %s, size: %d, ps : %sms", value, singlyLinkedList.size(), end - start));
    }

    @Test
    public void getLast() {
        batch();

        long start = System.currentTimeMillis();
        int value = (int) singlyLinkedList.get(fix - 1);
        long end = System.currentTimeMillis();

        log.info(String.format("value: %s, size: %d, ps : %sms", value, singlyLinkedList.size(), end - start));
    }

    @Test
    public void remove() {
        batch();

        long start = System.currentTimeMillis();
        singlyLinkedList.remove(100);
        long end = System.currentTimeMillis();

        log.info(String.format("size: %d, ps : %sms", singlyLinkedList.size(), end - start));
    }
}
