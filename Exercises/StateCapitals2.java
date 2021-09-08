package Exercises;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class StateCapitals2 {
    public static void main(String [] args){
        Map<String, String> states = new HashMap<>();
        File input = new File("StateCapitals.txt");
        try{
            Scanner Scan = new Scanner(input);
            while(Scan.hasNextLine()){
                String line = Scan.nextLine();
                states.put(line.split("::",2)[0],line.split("::",2)[1]);
                
            }
            //System.out.println(states);
            Random gen = new Random();
            Scanner in = new Scanner(System.in);
            int count =0;
            System.out.println("How many rounds do you want?");
            int rounds = in.nextInt();
            int t = rounds;
            in.nextLine();


            while(rounds-->0){
            Object[] values = states.keySet().toArray();
            int rand = gen.nextInt(values.length);
            Object val = values[rand];
            
            System.out.println("Guess what is the capital of "+ val);
            String response = in.nextLine();
            if(states.get(values[rand]).equals(response)){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Nice try it was " + states.get(values[rand]));
            }
            states.remove(values[rand]);
            System.out.println();
        }
            Scan.close();
            in.close();
            System.out.println("You got "+count+ " correct out of "+ t);
        }catch(Exception e){
            System.out.println("Invalid input");
        }

    }
    
}
