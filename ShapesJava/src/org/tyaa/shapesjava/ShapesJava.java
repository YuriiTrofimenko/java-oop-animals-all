/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.shapesjava;

/**
 *
 * @author student
 */
public class ShapesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        c.centerPoint = new Point(10d, 50d);
        c.radius = 30d;
        c.show();
        c.scale(2);
        c.show();
    }
    
}
