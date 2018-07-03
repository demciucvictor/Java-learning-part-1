
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int nr=Integer.parseInt(reader.nextLine());
        if(nr%2==1||nr%2==-1){    
        String printing="Number " + nr + " is odd.";
            System.out.println(printing);
        }
        else {  
            String printing="Number " + nr + " is even.";
            System.out.println(printing);
        }

    }
}
