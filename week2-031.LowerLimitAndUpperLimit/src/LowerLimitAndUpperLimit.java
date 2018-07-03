
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First number: ");
        int nr1=Integer.parseInt(reader.nextLine());
        System.out.println("Second number: ");
        int nr2=Integer.parseInt(reader.nextLine());
        while (nr1<=nr2){   
            System.out.println(nr1);
            nr1++;
        }


    }
}
