
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        double c=(double)a/b;
        
        String printing ="Division: " + a + " / " + b + " = " + c;
        System.out.println(printing);

        // Implement your program here. Remember to ask the input from user.
    }
}
