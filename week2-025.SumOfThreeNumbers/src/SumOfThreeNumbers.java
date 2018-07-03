
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; //store numbers read form user in this variable
        System.out.println("First number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;
        System.out.println("Second number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;
        System.out.println("Third number: ");
        read=Integer.parseInt(reader.nextLine());
        sum=sum+read;
        


        System.out.println("Sum: " + sum);
    }
}
