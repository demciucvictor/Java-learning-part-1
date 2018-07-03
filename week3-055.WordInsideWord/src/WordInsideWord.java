
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String n1=reader.nextLine();
        System.out.println("Type the second word: ");
        String n2=reader.nextLine();
        int i=n1.indexOf(n2);
        if(i==-1){  
            System.out.println("The word '" + n2 + "' is not found in the word '" + n1 + "'.");
        }
        else{   
            System.out.println("The word '" + n2 + "' is found in the word '" + n1 + "'.");
        }
        
    }
}
