
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) { 
            System.out.println("Type a password: ");
            String uspw=reader.nextLine();
            if (uspw.equals(password)){ 
                System.out.println("Right!");
                break;
            }else { 
                System.out.println("Wrong!");
            }

        }
        System.out.println("Secret message :)");
    }
}
