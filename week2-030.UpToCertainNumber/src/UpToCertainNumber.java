
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        int n=1;
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to which number: ");
        int i=Integer.parseInt(reader.nextLine());
        while (n<=i){   
            System.out.println(n);
            n++;
        }
            
        
        
    }
}
