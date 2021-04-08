package com.example.demo.dpattern.delegate;

public class Cat {
    private SoundBehaviour soundBehaviour;

    public Cat(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void sound() {
        soundBehaviour.makeSound();
    }
}
