import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.random=new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i;
        int j=0;
        while(j<7){ 
            while (true){   
                i=random.nextInt(39)+1;
                if(!this.containsNumber(i)){   
                    numbers.add(i);
                    break;
                }
            }
            j++;
        }
        
        
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){  
            return true;
        }else{
            return false;
        }
    }
}