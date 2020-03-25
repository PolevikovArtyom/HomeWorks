package ru.ifmo.base.farm;

public class FarmCat extends FarmAnimals {
    private String name;
    private int weight = 5;
    private int speed = 15;
    private int health = 15;
    private int resources = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getHealth() {
        return health;
    }

    public int getResources() {
        return resources;
    }
}
