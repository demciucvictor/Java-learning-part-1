
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String temp="";
        char t;
        int i=0;
        while(i<text.length()){   
             t=text.charAt(text.length()-i-1);
             temp+=t;
             i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
