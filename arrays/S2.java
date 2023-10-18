package assignments.arrays;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Org Array : ");

        int[] arr = {2,6,4,9,1,7,};
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the position from 0-5 to insert the value : ");
        int pos = sc.nextInt();
        System.out.println("Enter the value : ");
        int val = sc.nextInt();

        int[] newArr = new int[arr.length+1];
        int start = 0 ;

        for (int i=0;i<newArr.length;i++){
            if (i == pos){
                newArr[i] = val;
            }
            else {
                newArr[i] = arr[start];
                start++;
            }
        }
        System.out.println("--------------------------------");

        System.out.print("Updated Array : ");

        for (int i=0;i< newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

        System.out.println();

    }
}
