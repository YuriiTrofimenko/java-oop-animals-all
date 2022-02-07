package org.tyaa.animalslib;

public interface ISoundable {

    default void sound() {
        System.out.println("Издаю звук...");
    }
}
