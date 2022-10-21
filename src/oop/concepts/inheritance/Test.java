/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.concepts.inheritance;


public class Test {
    
    public static void main(String[] args) {
    
        Shape c = new Circle();
        System.out.println("Area of the cicle is:"+c.area());
        
        Shape s = new Cube();
        System.out.println("Area of the cube is:"+s.area());
        
        Shape3d z = new Cube();
        System.out.println("volume of the cube is:"+z.volume());
    }
}
