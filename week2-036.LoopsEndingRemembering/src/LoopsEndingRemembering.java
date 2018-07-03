import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type number: ");
        int sum=0;
        int n=0;
        double avg;
        int odd=0, even=0;
        while (true){   
            int i=Integer.parseInt(reader.nextLine());
            if(i==-1){  
                System.out.println("Thank you and see you later!");
                break;
            }
            sum+=i;
            n++;
            if(i%2==0){ 
                even++;
            }
            else{   
                odd++;
            }
        }
        avg=(double)sum/n;
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers " + n);
        System.out.print("Average: ");
        System.out.println(avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
