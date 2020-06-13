package com.example.demo.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class ArrayListTest {

    private static final Logger log = LoggerFactory.getLogger(LinkedListTest.class);

    final ArrayList<Integer> arrayList = new ArrayList<>();
    final int fix = 10000000;

    @BeforeEach
    public void setUp() {

    }

    void batch() {
        long start = System.currentTimeMillis();
        IntStream.range(0, fix).forEach(arrayList::add);
        long end = System.currentTimeMillis();

        log.info(String.format("size: %s, ps : %s", arrayList.size(), end - start));
    }

    @Test
    @DisplayName("데이터 탐색")
    public void get() {
        batch();
//
        long start = System.currentTimeMillis();
        int value = arrayList.get(fix - 1);
        long end = System.currentTimeMillis();

        log.info(String.format("value: %s, size: %d, ps : %sms", value, arrayList.size(), end - start));
    }

    @Test
    public void remove() {
        batch();

        long start = System.currentTimeMillis();
        arrayList.remove(100);
        long end = System.currentTimeMillis();

        log.info(String.format("size: %d, ps : %sms", arrayList.size(), end - start));
    }
}
