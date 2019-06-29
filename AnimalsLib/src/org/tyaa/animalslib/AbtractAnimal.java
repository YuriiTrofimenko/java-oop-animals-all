package org.tyaa.animalslib;

public abstract class AbtractAnimal {

    private double weight;

    private int age;

    public void eat() {
    }

    public double setWeight(double weiht) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getWeight() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int setAge(int age) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getAge() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public abstract void breathe();
}
