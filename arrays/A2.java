package assignments.arrays;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {

        int[] arr = {2,9,15,36,14};
        int[] newArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
                newArr[i] = arr[i];
        }

        for(int a=0;a<arr.length;a++) {
            System.out.println(newArr[a]);
        }
    }
}
