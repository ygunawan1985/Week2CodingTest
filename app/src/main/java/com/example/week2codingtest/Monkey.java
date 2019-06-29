package com.example.week2codingtest;

public class Monkey extends Animal {

    public Monkey() {
    }

    public Monkey(int totalAnimals, int energyLevel) {
        super(totalAnimals, energyLevel);
    }

    @Override
    public void eatFood() {
        super.setEnergyLevel(super.getEnergyLevel() + 2);
    }

    @Override
    public void makeSound() {
        super.setEnergyLevel(super.getEnergyLevel() - 4);
    }

    public void play(){
        System.out.println("Oooo Oooo Oooo");

        if(super.getEnergyLevel() < 8)
            System.out.println("Monkey is too tired!");
        else
            super.setEnergyLevel(super.getEnergyLevel() - 8);
    }
}
