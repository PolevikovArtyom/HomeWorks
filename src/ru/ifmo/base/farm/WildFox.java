package ru.ifmo.base.farm;

public class WildFox extends WildAnimals {
    private String name;
    private int weight = 10;
    private int speed = 30;
    private int strength = 30;

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
