import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int[] values = {6, 3, 0, -1, 4};
       sort(values);
  
    }
    public static int smallest(int[] array) {
    int a=array[0];
    for(int i=0; i<array.length; i++){    
        if (a>=array[i]){   
            a=array[i];
        }
    }
    return a;
    }
    public static int indexOfTheSmallest(int[] array) {
        int a=array[0];
        int b=0;
        for(int i=0; i<array.length; i++){
            if(a>=array[i]){    
                b=i;
                a=array[i];
            }
        }return b;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int a=array[index];
        int b=index;
        for(int i=index; i<array.length; i++){
            if(a>=array[i]){    
                b=i;
                a=array[i];
            }
        }return b;
    }
    public static void swap(int[] array, int index1, int index2) {
        int a=array[index1];
        array[index1]=array[index2];
        array[index2]=a;
    }
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length; i++){
            int a;
            a = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, a);
            System.out.println(Arrays.toString(array));
        }
    }
    

}
