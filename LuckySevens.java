import java.util.Scanner;
import java.util.Random;


public class LuckySevens {
    public static void run() {
        Scanner Scan = new Scanner(System.in);
        Random Ran = new Random();
        do{
        System.out.println("How many dollars do you have? ");
        int money = Scan.nextInt();
        int max =0;
        int cnt =0;
        int Mmoney = 0;
        int num =0;
        while(money>0){
            num = Ran.nextInt(11)+2;
            if(num==7){
                money+=4;
            }else{
                if(money>Mmoney){
                    Mmoney = money;
                    max = cnt;
                }
                money--;
            }
            cnt++;
        }
        System.out.println("You are broke after "+cnt+" rolls");
        System.out.println("You should have quit after "+max+" rolls when you had "+Mmoney);
        System.out.println("Play again?");
    }while(!Scan.next().equalsIgnoreCase("no"));
    }
}
