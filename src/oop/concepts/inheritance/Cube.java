
package oop.concepts.inheritance;

import java.util.Scanner;


public class Cube implements Shape3d{
    
    
    @Override
    public double area(){
    Scanner s1 = new Scanner(System.in);
     System.out.println("Enter edge size"); 
     
     
     double l = s1.nextDouble();
     
     
     double area1 = l*l ;
     return area1;
        
 
 
    }

    @Override
    public double volume() {
        
    Scanner s1 = new Scanner(System.in);
     System.out.println("Enter edge size"); 
     
     
     double l = s1.nextDouble();
     
     
     double volume1 = l*l*l ;
     
     return volume1;
       
    }
}
