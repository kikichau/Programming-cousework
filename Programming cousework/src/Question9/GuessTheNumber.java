package Question9;

import java.util.*;

public class GuessTheNumber {

    public static void main (String[]args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Think of a number between 1 and 2000\n");

        double max = 2000;
        double x = max/2;

        while (true) {
            System.out.println("Is your number less than "+ (int)x +" ?\nPleaser enter your anwser of Y/N.\nAfter I guess your number, Please type Good");
            String truth = scan.next();

            if(truth.equals("Y")){
                if(x == x/2) break;
                x=x/2;
            }
            if(truth.equals("N")){
                if(x == x + x/2) break;
                x+=x/2;
            }
            if(truth.equals("Good")){
                System.out.println("Your number is: " + x );
                //scan.close();
                }
        }
    }
}
