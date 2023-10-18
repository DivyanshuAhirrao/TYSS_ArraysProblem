package assignments.arrays.logical;

import java.util.Arrays;

public class DuplicateInSameArray {
    public static void main(String[] args) {
        int[] arr = {1,3,1};

        arr = Arrays.copyOf(arr, arr.length+3);

        int ind = 0;
        for (int i=3;i<arr.length;i++){
            arr[i] = arr[ind];
            ind++;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }


    }
}
