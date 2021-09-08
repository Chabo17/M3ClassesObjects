package Shapes;

public class Square extends Shape{
    
    double length;

    Square(double length){
        this.length = length;
    }

    @Override
    double getArea() {
        return length*length;
    }

    @Override
    double getPerimeter() {
        return 4*length;
    }
    
}
