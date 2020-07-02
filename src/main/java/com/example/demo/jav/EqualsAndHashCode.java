package com.example.demo.jav;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 동일성, 동등성
 */
public class EqualsAndHashCode {

    long id;
    String name;

    public EqualsAndHashCode(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCode that = (EqualsAndHashCode) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        EqualsAndHashCode equalsAndHashCode = new EqualsAndHashCode(1, "hello");
        EqualsAndHashCode equalsAndHashCode2 = new EqualsAndHashCode(1, "hello");

        System.out.println("identity : " + (equalsAndHashCode == equalsAndHashCode2));
        System.out.println("equality : " + equalsAndHashCode.equals(equalsAndHashCode2));
        System.out.println("hashCode : " + equalsAndHashCode.hashCode() + " ,, " + equalsAndHashCode2.hashCode());

        Map<EqualsAndHashCode, Object> map = new HashMap<>();
        map.put(equalsAndHashCode, "11");
        map.put(equalsAndHashCode2, "22");

        System.out.println("size : " + map.size());
    }
}
