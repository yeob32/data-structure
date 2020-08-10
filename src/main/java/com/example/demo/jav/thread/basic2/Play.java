package com.example.demo.jav.thread.basic2;

public class Play {

    public static void main(String[] args) {

        MusicBox musicBox = new MusicBox();

        MusicPlayer p1 = new MusicPlayer(1, musicBox);
        MusicPlayer p2 = new MusicPlayer(2, musicBox);
        MusicPlayer p3 = new MusicPlayer(3, musicBox);

        p1.start();
        p2.start();
        p3.start();
    }
}
