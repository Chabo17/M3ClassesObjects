package Shapes;



public class Shaper {
    public static void main(String [] args){
        Circle circ = new Circle(2);
        Rectangle rect = new Rectangle(10,5);
        Square sqrt = new Square(5);
        Triangle tri = new Triangle(2,3,5);

        System.out.println("The perimeter of the circle is: "+circ.getPerimeter());
        System.out.println("The area of the circle is: "+circ.getArea());

        System.out.println("The perimeter of the rectangle is: "+ rect.getPerimeter());
        System.out.println("The area of the rectangle is: "+ rect.getArea());

        System.out.println("The perimeter of the square is: "+ sqrt.getPerimeter());
        System.out.println("The area of the square is: "+ sqrt.getArea());

        System.out.println("The perimeter of the triangle is: "+ tri.getPerimeter());
        System.out.println("The area of the triangle is: "+ tri.getArea());
    }
}
