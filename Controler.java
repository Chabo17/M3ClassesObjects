import java.util.Scanner;

public class Controler {
    public static void main(String [] args){
        double n1,n2,result;
        String op;
        SimpleCalculator Calc = new SimpleCalculator();
        do{
            System.out.println("Please give a standard equation");
            Scanner Scan = new Scanner(System.in);
            try{
            n1 = Scan.nextDouble();
            op = Scan.next();
            n2 = Scan.nextDouble();
            result = Calc.run(n1,n2,op);
            }catch(Exception e){
                System.out.println("INPUT ERROR");
            }
            //System.out.print(n1 + " " + op + " "+ n2 + " = ");
            //System.out.println();
        }while(true);
    }
}
