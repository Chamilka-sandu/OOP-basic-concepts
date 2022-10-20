/*
 *example for Abstraction  
 */
package oop.concepts;

//import java.util.Scanner;


public abstract class Shape {

    
 abstract  void  Area();
    
}

class Circle extends Shape{
    
    public int r ;

    
Circle(int r){

    
    this.r = r ;
    
}

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

@Override
    void Area(){
                    double area = r * 3.14 *2;


    

    System.out.println(area);   

    
    }
 }