package org.tyaa.animalslib;

public class Cat extends AbstractPet implements ISoundable {

    public void breathe() {
        System.out.println("Дышу легкими");
    }

    @Override
    public void sound() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Ем мышь");
    }
    
    
}
