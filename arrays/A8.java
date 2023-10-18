package assignments.arrays;

import java.util.Arrays;

public class A8 {
    public static void main(String[] args) {
        int[] arr = {12, 9, 32, 30, 18, 32, 12, 9};
        Arrays.sort(arr);

        int j=0;

        for (int i=0; i<arr.length-1;i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length-1];

        for (int i=0; i<j;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
