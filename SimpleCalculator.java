public class SimpleCalculator {
   
    public SimpleCalculator(){}

    public static double run(double n1, double n2, String op){
        switch(op){
            case "+":
                System.out.println(n1 + " + " + n2 + " = " +(n1+n2));
                return n1+n2;
            case "-":
            System.out.println(n1 + " - " + n2 + " = " +(n1-n2));
                return n1-n2;
            case "*":
            System.out.println(n1 + " * " + n2 + " = " +(n1*n2));
                return n1*n2;
            case "/":
            System.out.println(n1 + " / " + n2 + " = " +(n1/n2));
                return n1/n2;
        }
        System.out.println("INPUT ERROR");
        return 0;
    }
}
