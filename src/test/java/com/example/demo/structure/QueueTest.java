package com.example.demo.structure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class QueueTest {

    @Test
    public void simpleTest() {
        Queue<String> queue = new Queue<>();

        queue.add("t1");
        queue.add("t2");
        queue.add("t3");
        queue.add("t4");

        Assertions.assertEquals(queue.size(), 4);
        Assertions.assertEquals(queue.element(), "t1");
        Assertions.assertEquals(queue.peek(), "t1");

        Assertions.assertEquals(queue.remove(), "t1");
        Assertions.assertEquals(queue.poll(), "t2");

        Assertions.assertEquals(queue.size(), 2);
        Assertions.assertEquals(queue.peek(), "t3");

        Assertions.assertEquals(queue.remove(), "t3");
        Assertions.assertEquals(queue.poll(), "t4");

        Assertions.assertNull(queue.poll());
        Assertions.assertNull(queue.peek());
        Assertions.assertThrows(NoSuchElementException.class, queue::remove);
        Assertions.assertThrows(NoSuchElementException.class, queue::element);

        Assertions.assertEquals(queue.size(), 0);
    }
}
