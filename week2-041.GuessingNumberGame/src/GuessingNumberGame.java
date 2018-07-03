
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int n=0;

        // program your solution here. Do not touch the above lines!
        while (true){   
            System.out.println("Guess a number: ");
            int i=Integer.parseInt(reader.nextLine());
            if (i==numberDrawn){    
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if(i<numberDrawn){ 
                n++;
                System.out.println("The number is greater, guesses made: " + n);
                
            }
            else if(i>numberDrawn){ 
                n++;
                System.out.println("The number is lesser, guesses made: " + n);
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
