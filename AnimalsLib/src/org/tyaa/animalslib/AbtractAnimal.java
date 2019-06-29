package org.tyaa.animalslib;

public abstract class AbtractAnimal {

    private double weight;

    private int age;

    public void eat() {
        System.out.println("Ем пищу");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public abstract void breathe();
}
