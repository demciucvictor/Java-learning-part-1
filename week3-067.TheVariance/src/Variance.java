import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int i=0;
        int sum=0;
        while(i<list.size()){   
            sum+=list.get(i);
            i++;
        }
        return sum;
        
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg=(double)sum(list)/list.size();
        
        return avg;
        
    }

    public static double variance(ArrayList<Integer> list) {
        int i=0;
        double j=0;
        double avg=average(list);
        while(i<list.size()){   
            j+=(double)Math.pow(list.get(i)-avg, 2);
            
            i++;
        }
        
        j=(double)j/(list.size()-1);
        return j;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
