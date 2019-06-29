package com.example.week2codingtest;

public class Tiger extends Animal {

    public Tiger() {
    }

    public Tiger(int totalAnimals, int energyLevel) {
        super(totalAnimals, energyLevel);
    }

    public void sleep(){
        super.setEnergyLevel(super.getEnergyLevel() + 5);
    }

    public void eatGrain(){
        System.out.println("Tiger cannot eat grain due to their sensitive digestive system.");
    }
}
