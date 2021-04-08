package com.example.demo.dpattern.delegate;

public class MeowSound implements SoundBehaviour {
    @Override
    public void makeSound() {
        System.out.println("meow!");
    }
}
