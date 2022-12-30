package Polymorphism_and_Abstract_Classes;

public class Triangle extends Box{
   
    public Triangle() {
        super(x, y);
        //TODO Auto-generated constructor stub
    }

    public void area(){
        double area = (x*y)/2;
        System.out.println("area of triangle is:\t"+area);
    }
}
