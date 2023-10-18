package assignments.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {

        int[] arr = {12, 120, 32, 30, 18, 60, 45, 90};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0 && arr[i]%3==0 && arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }

    }
}
