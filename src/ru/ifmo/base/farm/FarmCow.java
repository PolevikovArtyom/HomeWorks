package ru.ifmo.base.farm;

public class FarmCow extends FarmAnimals implements Eatable {
    private String name;
    private int weight = 100;
    private int speed = 25;
    private int health = 100;
    private int resources = 2;

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
