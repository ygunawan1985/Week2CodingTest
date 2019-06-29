package com.example.week2codingtest;

public class Q4JungleCodingChallenge {

    public static void main(String[] args) {
        Jungle jungle = new Jungle();
        jungle.addMonkey(10, 10);
        jungle.addMonkey(10, 15);
        jungle.addSnake(15, 8);
        jungle.addSnake(15, 6);
        jungle.addTiger(7, 20);
        jungle.addTiger(7, 30);

        jungle.soundOff();
    }
}
