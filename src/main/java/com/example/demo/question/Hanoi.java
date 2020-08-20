package com.example.demo.question;

public class Hanoi {

    public static void main(String[] args) {
        move(3, 'a', 'b', 'c');
    }

    public static void move(int top, char start, char via, char to) {
        if (top == 1) {
            System.out.println(start + " -> " + to);
        } else {
            move(top - 1, start, to, via);
            System.out.println(start + " -> " + to);
            move(top - 1, via, start, to);
        }
    }
}
