package Arrays;
import java.util.Arrays;

/**
 Given an array arr[] and an integer K where K is smaller than size of array,
 the task is to find the Kth smallest element in the given array.
 It is given that all array elements are distinct.

 @author Rajan Baliwal
 @username - rbaliwal00
 @version - 2021-09-11

 */

public class KthMaxMin {
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 20, 15};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

}
