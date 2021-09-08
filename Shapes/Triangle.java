package Shapes;

public class Triangle extends Shape{

    double a,b,c,base,height;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        this.base = b;
        this.height = c;

    }
    
    @Override
    double getArea() {
        return base*height/2;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }
}
