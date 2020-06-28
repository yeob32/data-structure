package com.example.demo.jav.gc;

public class MetaspaceTest {

    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    // OutOfMemoryError: Metaspace
    // -XX:MaxMetaspaceSize=128m
    public static void main(String[] args) throws Exception{
        for (int i = 0; ; i++) {
            if (i % 1000 == 0) Thread.sleep(100);
            Class c = cp.makeClass("io.github.yaboong.Generated" + i).toClass();
        }
    }
}
