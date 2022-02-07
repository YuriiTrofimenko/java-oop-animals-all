/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.animals;

import org.tyaa.animalslib.Cat;
import org.tyaa.animalslib.Goldfish;
import org.tyaa.animalslib.Leopard;

/**
 *
 * @author student
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        cat.breathe();
        cat.eat();
        cat.sound();
        System.out.println();
        Goldfish g = new Goldfish();
        g.eat();
        System.out.println();
        Leopard leopard = new Leopard();
        leopard.sound();
    }
    
}
