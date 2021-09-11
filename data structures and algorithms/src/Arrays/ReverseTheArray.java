package Arrays;

/**
 Demo program to reverse a given array.

 @author Rajan Baliwal
 @username - rbaliwal00
 @version - 2021-09-11

 */

public class ReverseTheArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int size = 6;

        for(int i = size; i > 0; i--){
            System.out.println(arr[i-1]);
        }
    }
}
