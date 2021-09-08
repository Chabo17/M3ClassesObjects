package Exercises;
import java.util.Scanner;

public class Factorizer {

    Factorizer(){

    }

    public static void Factor() {
        int num =0;
        Scanner Can = new Scanner(System.in);
        do{
            System.out.print("What number would you like to factor? ");
            
            num = Can.nextInt();
            int sum =0,j=0;

            System.out.println("The factors of "+num+" are:");

            for(int i =1; i<num;i++){
                if(num%i==0){
                    sum+=i;
                    System.out.print(i+" ");
                    j++;
                }
            }     
            System.out.println(num); j++;      

            System.out.println("\n"+num + " has "+ j + " factors");
            if(sum == num){
                System.out.println(num + " is a perfect number");
            }else {
                System.out.println(num + " is not a perfect number");
            }

            if(j==2){
                System.out.println(num + " is a prime number");
            }else {
                System.out.println(num + " is not a prime number");
            }
            System.out.println();
            
        }while(num>0);
        Can.close();
    }
}
