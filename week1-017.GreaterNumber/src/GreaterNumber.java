import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int nr1=Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int nr2=Integer.parseInt(reader.nextLine());
        if (nr1==nr2){  
            System.out.println("The numbers are equal!");
        }
        else if(nr1>nr2){   
            String printing="Greater number: " + nr1;
            System.out.println(printing);
            
                    
                    
        }
        else {  
                    String printing="Greater number: " + nr2;
                    System.out.println(printing);
                    }

    }
}
