
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) { 
            System.out.println("Write the temperature(to stop type 100): ");
            double t=Double.parseDouble(reader.nextLine());
            if(t==100){ 
                break;
            }
            if (t>=-30&&t<=40){ 
                Graph.addNumber(t);
            }
            else {
                System.out.println("Wrong temperature!");
            }
            if(t==100){ 
                break;
            }
            
            

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        }    // Remove or comment out these lines above before trying to run the tests.
    }
}
