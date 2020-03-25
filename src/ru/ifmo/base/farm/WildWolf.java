package ru.ifmo.base.farm;

public class WildWolf extends WildAnimals {
    private String name;
    private int weight = 50;
    private int speed = 50;
    private int strength = 50;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }
}
