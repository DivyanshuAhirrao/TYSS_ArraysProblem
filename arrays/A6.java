package assignments.arrays;

import java.util.Arrays;

public class A6 {
    public static void main(String[] args) {
        int[] arr = {12, 120, 32, 30, 18, 60, 45, 90};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
