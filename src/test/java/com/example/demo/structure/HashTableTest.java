package com.example.demo.structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HashTableTest {

    @Test
    @DisplayName("해시테이블 샘플")
    public void sample() {
        HashTable hashTable = new HashTable(3);
        hashTable.put("yeob32", "yeob32 zzzzzz!");
        hashTable.put("yeop1201", "yeop1201 zzzzzz!");
        hashTable.put("ksyy1201", "ksyy1201 zzzzzz!");

        assertEquals(hashTable.get("yeob32"), "yeob32 zzzzzz!");
        assertEquals(hashTable.get("yeop1201"), "yeop1201 zzzzzz!");
        assertEquals(hashTable.get("ksyy1201"), "ksyy1201 zzzzzz!");

        hashTable.remove("yeob32");
        hashTable.remove("yeop1201");
        hashTable.remove("ksyy1201");

        assertNull(hashTable.get("yeob32"), "yeob32 zzzzzz!");
        assertNull(hashTable.get("yeop1201"), "yeop1201 zzzzzz!");
        assertNull(hashTable.get("ksyy1201"), "ksyy1201 zzzzzz!");
    }
}
