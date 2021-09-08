import java.util.Scanner;

public class InterestCalculator {
    public static void calc() {
        Scanner Scan = new Scanner(System.in);
        double invest=0,years=0, rate=0;
        System.out.print("How much do you want to invest? ");
        invest = Scan.nextDouble();
        System.out.print("How many years are you investing? ");
        years = Scan.nextDouble();
        System.out.print("What is the annual interest rate % growth? ");
        rate = Scan.nextDouble();
        System.out.println("\nCalculating...");
        for(int i=1; i<=years;i++){
            System.out.println("Year "+i+":");
            System.out.println("Began with $"+invest);
            System.out.println("Earned $"+((invest*(1+(rate/100)))-invest));
            //System.out.println(((rate/100)+1)*invest);
            invest = invest*(1+(rate/100)); 
            System.out.println("Ended with $"+invest);
        }
        Scan.close();
    }
}
