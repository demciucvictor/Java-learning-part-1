import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your word: ");
        String name=reader.nextLine();
        System.out.println("Length of the first part: ");
        int n=Integer.parseInt(reader.nextLine());
        System.out.print("Result: " + name.substring(name.length()-n));
    }
}
