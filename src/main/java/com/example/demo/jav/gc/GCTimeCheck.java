package com.example.demo.jav.gc;

public class GCTimeCheck {

    // javac /Users/ksy/IdeaProjects/data-structure/src/main/java/com/example/demo/jav/GCTimeCheck.java
    // java -cp /Users/ksy/IdeaProjects/data-structure/src/main/java -verbose:gc -XX:+PrintCommandLineFlags com.example.demo.jav.GCTimeCheck

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.gc();
        long end = System.nanoTime();

        System.out.println(end - start);
    }
}
