/*
 *example for Abstraction by using absract class  
 */
package oop.concepts;

//import java.util.Scanner;

import java.util.Scanner;



public abstract class Shape {    
    
 abstract public  double  Area();
    
}

class Circle extends Shape{
     
   
    @Override
public double  Area( ){
 
      System.out.println("Enter radius"); 
      Scanner s = new Scanner(System.in);
      
        double r = s.nextDouble();
    double area = 3.14 * r*r;
    return area;
      
    
    }
}
 class Square extends Shape{
 
 @Override
 public double Area(){
     Scanner s1 = new Scanner(System.in);
     System.out.println("Enter lenght"); 
     System.out.println("Enter width");  
     
     double l = s1.nextDouble();
     double w = s1.nextDouble();
     
     double area1 = l*w ;
     return area1;
 
 
 }
 
 }
    
 