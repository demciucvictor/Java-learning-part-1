
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int r=Integer.parseInt(reader.nextLine());
        double c=(double)2*r*Math.PI;
        System.out.println("Circumference of the circle: " + c);

        // Program your solution here 
    }
}
