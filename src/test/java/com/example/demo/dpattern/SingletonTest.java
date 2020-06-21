package com.example.demo.dpattern;

import com.example.demo.dpattern.singleton.Singleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 디자인 패턴")
    public void singleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    @DisplayName("싱글톤 2")
    public void singleton2() {
        Singleton singleton1 = Singleton.getLazyInstance();
        Singleton singleton2 = Singleton.getLazyInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

    @Test
    @DisplayName("싱글톤 아닐 경우")
    public void noneSingleton() {
        NoneSingleton none1 = new NoneSingleton();
        NoneSingleton none2 = new NoneSingleton();

        Assertions.assertNotEquals(none1, none2);
    }

    public static class NoneSingleton {
        public NoneSingleton() {
        }
    }
}
