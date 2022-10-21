/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.concepts.inheritance;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Circle implements Shape {
    
    @Override
    public double area(){
    
    System.out.println("Enter radius"); 
      Scanner s = new Scanner(System.in);
      
        double r = s.nextDouble();
    double area2 = 3.14 * r*r;
    return area2;
    }
    
}
