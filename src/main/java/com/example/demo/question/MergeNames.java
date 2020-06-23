package com.example.demo.question;

import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set = new HashSet(Arrays.asList(names1));
        set.addAll(Arrays.asList(names2));
        return (String[]) set.toArray();
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", com.example.demo.lambda.MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
