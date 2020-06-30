package com.example.demo.thread.basic2;

public class MusicPlayer extends Thread {

    int type;
    MusicBox musicBox;

    public MusicPlayer(int type, MusicBox musicBox) {
        this.type = type;
        this.musicBox = musicBox;
    }

    @Override
    public void run() {
        switch (type) {
            case 1: musicBox.dropTheBeatA(); break;
            case 2: musicBox.dropTheBeatB(); break;
            case 3: musicBox.dropTheBeatC(); break;
        }
    }
}
