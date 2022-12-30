package Polymorphism_and_Abstract_Classes;

import Interfaces.Interface1;

public class Rectangle extends Box{

    public Rectangle() {
        super(x,y);
        //TODO Auto-generated constructor stub
    }

    public void area(){
        double area = (x*y);
        System.out.println("area of rectangle is:\t"+area);
    }
}
