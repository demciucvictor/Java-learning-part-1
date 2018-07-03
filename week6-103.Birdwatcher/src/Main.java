import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {  

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> birds = new ArrayList<String>();
    ArrayList<String> latin = new ArrayList<String>();
    int[] observations = new int[100];
    int n=0;
    while (true){
        System.out.print("?");
        String t=scanner(reader);
        if(t.equals("Add")){    
            System.out.print("Name: ");
            birds.add(scanner(reader));
            System.out.print("Latin Name: ");
            latin.add(scanner(reader));
            observations[n]=0;
            n++;
            
        }else if(t.equals("Observation")){
            System.out.print("What was observed:?");
            String temp=scanner(reader);
            if (birds.contains(temp)){
                int i=birds.indexOf(temp);
                observations[i]++;
                
            }else{  
                System.out.println("Is not a bird!");
            }
        }else if(t.equals("Statistics")){
            int j;
            for(j=0; j<birds.size(); j++){
                System.out.println(birds.get(j) + " (" + latin.get(j) + "): " + observations[j] + " observations");
            }
        }else if(t.equals("Show")){
            System.out.print("What? ");
            String tempname=scanner(reader);
            if(birds.contains(tempname)){
                int tempindex=birds.indexOf(tempname);
                System.out.println(birds.get(tempindex) + " (" + latin.get(tempindex) + "): " + observations[tempindex] + " observations");
            }else{
                System.out.println("Is not a bird!");
            }
        }else if(t.equals("Quit")){
            break;
        }
    }
            
    }
    public static String scanner(Scanner reader){
        String temp = reader.nextLine();
        return temp;
    }
    
}
