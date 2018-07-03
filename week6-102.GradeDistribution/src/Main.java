import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        
        while (true){
            int t=scan(scanner);
            if(t!=-1){  
                points.add(t);
            }else{  
                break;
            }
        }
        System.out.println("Grade distribution:");
        Marks marks = new Marks();
        marks.determineMarks(points);
        marks.printingStars();
        marks.acceptence();
        
    }
    public static int scan(Scanner reader){   
        int temp = Integer.parseInt(reader.nextLine());
        return temp;
    }
}
