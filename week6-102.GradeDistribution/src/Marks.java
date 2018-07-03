import java.util.ArrayList;
public class Marks {
    private int n5;
    private int n4;
    private int n3;
    private int n2;
    private int n1;
    private int n0;
    
    public Marks(){
        
    }
    
    public void determineMarks(ArrayList<Integer> arrays){
        for(int n : arrays){    
            if(n>=0&&n<=29){
                n0++;
            }else if(n>29&&n<=34){  
                n1++;
            }else if(n>34&&n<=39){
                n2++;
            }else if(n>39&&n<=44){
                n3++;
            }else if (n>44&&n<=49){ 
                n4++;
            }else if(n>49&&n<=60){  
                n5++;
            }
        }
    }
    public void printingStars(){  
        System.out.print("5:");
        Stars(n5);
        System.out.print("4:");
        Stars(n4);
        System.out.print("3:");
        Stars(n3);
        System.out.print("2:");
        Stars(n2);
        System.out.print("1:");
        Stars(n1);
        System.out.print("0:");
        Stars(n0);
    }
    public void Stars(int n){
        int i=0;
        while (i<n){    
            System.out.print("*");
            i++;
        }System.out.println("");
    }
    public void acceptence(){   
        double temp=0;
        temp=(double)100*(n5+n4+n3+n2+n1)/(n5+n4+n3+n2+n1+n0);
        System.out.println("Acceptance percentage: " + temp);
    }
    
}
