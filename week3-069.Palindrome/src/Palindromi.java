import java.util.Scanner;

public class Palindromi {
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

    public static boolean palindrome(String text) {
        String reversed=reverse(text);
        if(text.equals(reversed)){ 
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
