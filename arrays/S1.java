package assignments.arrays;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Org Array : ");

        int[] arr = {2,6,4,9,1,7};
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter the length you need to extend : ");
        int len = sc.nextInt();

        int[] newArr = new int[arr.length+len];
        int start = 0;

        for (int i=0;i<newArr.length-1;i++){

            if (i == 0){
                newArr[i] = 0;
            }
            else {
                newArr[i] = arr[start];
                start++;
            }
        }
        System.out.println();
        System.out.println("--------------------------------");

        System.out.print("Updated Array : ");

        for (int i=0;i< newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
