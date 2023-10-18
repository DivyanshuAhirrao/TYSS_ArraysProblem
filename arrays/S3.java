package assignments.arrays;

import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int num = sc.nextInt();

        int[] arr = {5,9,3,4,6,8};
        int pos = 2;

        int[] array = new int[arr.length+1];
        int index = 0;

        for (int i=0;i<array.length;i++){
            if (i == pos){
                array[i] = num;
            }
            else {
                array[i] = arr[index];
                index++;
            }
        }

        for (int a=0;a<array.length;a++) {
            System.out.print(array[a]+" ");
        }

    }
}
