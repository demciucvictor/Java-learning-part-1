
import java.util.Scanner;

public class ManyPrints {
    
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
     
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        int i=Integer.parseInt(reader.nextLine());
        int n=1;
        while (n<=i){   
            printText();
            n++;
        }
    }
}
