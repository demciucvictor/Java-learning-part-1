
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String n=reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(n));
    }
    
    public static int calculateCharacters(String name){ 
        return name.length();
    }
    
}
