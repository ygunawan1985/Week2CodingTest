package com.example.week2codingtest;

public class Animal {

    private int totalAnimals;
    private int energyLevel;

    public Animal() {
    }

    public Animal(int totalAnimals, int energyLevel) {
        this.totalAnimals = totalAnimals;
        this.energyLevel = energyLevel;
    }

    public int getTotalAnimals() {
        return totalAnimals;
    }

    public void setTotalAnimals(int totalAnimals) {
        this.totalAnimals = totalAnimals;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void makeSound(){
        energyLevel -= 3;
    }

    public void eatFood(){
        energyLevel += 5;
    }

    public void sleep(){
        energyLevel += 10;
    }
}
