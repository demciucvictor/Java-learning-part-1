
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account Victor=new Account ("Victor's account", 100);
        Victor.deposit(20);
        System.out.println(Victor);
    }

}
