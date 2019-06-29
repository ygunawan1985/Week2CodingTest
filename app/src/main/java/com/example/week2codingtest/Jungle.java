package com.example.week2codingtest;

import java.util.ArrayList;

public class Jungle {

    public final int meat = 10;
    public final int fish = 10;
    public final int bugs = 10;
    public final int grain = 10;
    ArrayList<Tiger> tigers;
    ArrayList<Monkey> monkeys;
    ArrayList<Snake> snakes;

    public Jungle() {
        tigers = new ArrayList<>();
        monkeys = new ArrayList<>();
        snakes = new ArrayList<>();
    }

    public void addTiger(int totalAnimals, int energyLevel){
        tigers.add(new Tiger(totalAnimals, energyLevel));
    }

    public void addMonkey(int totalAnimals, int energyLevel){
        monkeys.add(new Monkey(totalAnimals, energyLevel));
    }

    public void addSnake(int totalAnimals, int energyLevel){
        snakes.add(new Snake(totalAnimals, energyLevel));
    }

    public void soundOff(){
        System.out.println("Tigers 1 and 2:");
        for(Tiger tiger : tigers){
            tiger.makeSound();
            System.out.println(tiger.getEnergyLevel());
        }

        System.out.println();

        System.out.println("Monkeys 1 and 2:");
        for(Monkey monkey : monkeys){
            monkey.makeSound();
            System.out.println(monkey.getEnergyLevel());
        }

        System.out.println();

        System.out.println("Snakes 1 and 2:");
        for(Snake snake : snakes){
            snake.makeSound();
            System.out.println(snake.getEnergyLevel());
        }
    }
}
