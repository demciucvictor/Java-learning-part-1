
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        ArrayList<Student> Students = new ArrayList<Student>();
        while (true){
            System.out.println("name: ");
            String name=reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("studentnumber: ");
            String sn=reader.nextLine();
            Students.add(new Student(name, sn));
        }
        for( Student studentprint : Students){
            System.out.println(studentprint);
        }
        System.out.println("Give search term: ");
        String search=reader.nextLine();
        System.out.println("Result: ");
        for( Student src : Students){   
            String current=src.getName();
            if(current.contains(search)){   
                System.out.println(src);
            }
        }
    }
}
