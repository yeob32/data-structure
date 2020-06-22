package com.example.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {

    Supplier<String> supplier = () -> "[supplier] Hello World";
    Function<List<String>, String> function = strings -> "[function]" + String.join(" ", strings);
    Consumer<String> consumer = o -> {
        System.out.println(o);
    };

    Predicate<String> predicate = s -> s.equals("Hello World");

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        System.out.println(lambdaTest.supplier.get());
        System.out.println(lambdaTest.function.apply(Arrays.asList("Hello", "world")));
        lambdaTest.consumer
                .andThen(System.out::println)
                .accept("[consumer] Hello World");

        System.out.println(lambdaTest.predicate
                .or(s -> s.equals("[predicate] Hello World"))
                .test("[predicate] Hello World"));
    }
}
