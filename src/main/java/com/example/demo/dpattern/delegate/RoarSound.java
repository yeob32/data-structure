package com.example.demo.dpattern.delegate;

public class RoarSound implements SoundBehaviour {
    @Override
    public void makeSound() {
        System.out.println("roar!");
    }
}
