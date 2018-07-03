public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            if(searchedValue>array[end] || searchedValue<array[beginning]){   
                break;
            }
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }

            // restrict the search area 
            
            if(searchedValue<array[middle]){
                end=middle;
            }else {  
                beginning=middle+1;
            }
        }
        return false;
    }
}
