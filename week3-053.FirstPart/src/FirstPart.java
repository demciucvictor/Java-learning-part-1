
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your word: ");
        String name=reader.nextLine();
        System.out.println("Length of the first part: ");
        int n=Integer.parseInt(reader.nextLine());
        System.out.print("Result: ");
        int i=1;
        while (i<=n){   
            System.out.print(name.charAt(i-1));
            i++;
        }
    }
}
