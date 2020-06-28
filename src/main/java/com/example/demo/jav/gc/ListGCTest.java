package com.example.demo.jav.gc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListGCTest {

    // VM Option
    // -Xmx16m -verbose:gc
    // -XX:+PrintGCDetails GC 상세
    public static void main(String[] args) throws Exception {

        // OutOfMemoryError: Java heap space
        // 루프 내부에서 초기화 되면 OutOfMemoryError 발생 안함
        List<Integer> list = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toList());

        for (int i=1; true; i++) {
            if (i % 100 == 0) {
//                list = new ArrayList<>();
                Thread.sleep(100);
            }
            IntStream.range(0, 100)
                    .forEach(list::add);
        }
    }
}
