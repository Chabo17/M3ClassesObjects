package Shapes;

public class Rectangle extends Shape{

    double length, width;
    
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    double getArea() {
        return length*width;
    }

    @Override
    double getPerimeter() {
        return (2*length)+(2*width);
    }
    
}
