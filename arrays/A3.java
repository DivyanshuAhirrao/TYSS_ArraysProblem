package assignments.arrays;

import java.util.Arrays;

public class A3 {
    public static void main(String[] args) {

        int[] a1 = {45, 23, 35, 12, 32};
        int[] a2 = {20, 30 ,56, 32};
        int size = a1.length + a2.length;

        int[] total = new int[size];

        for (int i=0;i<a1.length;i++) {
            total[i] = a1[i];
        }
        for (int i=0;i<a2.length;i++) {
            total[(a1.length)+i] = a2[i];
        }

        System.out.println(Arrays.toString(total));

    }
}
