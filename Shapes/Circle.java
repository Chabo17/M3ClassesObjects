package Shapes;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }
    
    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
}
