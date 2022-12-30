package Polymorphism_and_Abstract_Classes;

public abstract class Box {
    protected static double x = 0;
    protected static double y = 0;
    public Box(double width,double height){
        this.x = width;
        this.y = height;
     }
    public abstract void area();
}
