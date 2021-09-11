package Arrays;

/**
 Find the maximum and minimum element in an array

 @author Rajan Baliwal
 @username - rbaliwal00
 @version - 2021-09-11

 */

public class MinimumAndMaximum {
    public static void main(String[] args){
        int[] arr = {20,10,2,31,49,5,6};
        int size = 7, minimum = arr[0], maximum = arr[0];

        for(int i = 1; i < size; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println("Minimum element is: " + minimum + " Maximum element is: " + maximum);
    }
}
