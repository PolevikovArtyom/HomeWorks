package ru.ifmo.base.farm;

public class WildBear extends WildAnimals {
    private String name;
    private int weight = 100;
    private int speed = 40;
    private int strength = 100;

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
