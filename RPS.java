import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class RPS {

    public static void run() {
        
        int num=0;
        Scanner Scan = new Scanner(System.in);
        Random Ran = new Random();
        do{
            int pc =0, cc=0, PW=0,Ties=0, CW=0;//PW = player wins CW = computer wins
        while(num ==0){
            System.out.println("How many rounds do you wish to play?(1-10): ");
            try{
            num = Scan.nextInt();
            } catch(Exception e){
                System.out.println("Input not accepted");
                Scan.next();
            }
            if(num <1 || num >10){
                System.out.println("That was not an acceptable amount of rounds");
                num=0;
            }
        }

        do {
            System.out.print("Please choose one of the following: 1 = Rock, 2 = Paper, 3 = Scissors: ");
            pc = Scan.nextInt();
            cc = Ran.nextInt(3)+1;
            switch(pc){
                case 1:
                    if(cc ==1){
                        System.out.println("Tie");
                        Ties ++;
                    }else if(cc==2){
                        System.out.println("Paper wraps Rock to win");
                        CW++;
                    }else{
                        System.out.println("Rock breaks Scissors to win");
                        PW++;
                    }
                break;

                case 2:
                    if(cc ==1){
                        System.out.println("Paper wraps Rock to win");
                        PW ++;
                    }else if(cc==2){
                        System.out.println("Tie");
                        Ties ++;
                    }else{
                        System.out.println("Scissors cut Paper to win");
                        CW++;
                    }
                break;

                case 3:
                    if(cc ==1){
                        System.out.println("Rock breaks Scissors to win");
                        CW ++;
                    }else if(cc==2){
                        System.out.println("Scissors cut Paper to win");
                        PW++;
                    }else{
                        System.out.println("Tie");
                        Ties ++;

                    }
                break;

                default:
                break;
            }
            num--;
        }while(num>0);
        System.out.println("The player had " + PW+ " win(s), "+Ties+" tie(s), and "+CW+ " computer win(s)");
        System.out.println("Do you wish to contiue?");
        String response = Scan.nextLine();
        response = Scan.nextLine();
        
        if(response.equalsIgnoreCase("no")){
            num = -1;
            System.out.println("Thank you for playing!");
        }

    }while(num>=0);
   
    }
}