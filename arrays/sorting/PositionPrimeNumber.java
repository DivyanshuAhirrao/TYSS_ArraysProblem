package assignments.arrays.sorting;

import java.util.Scanner;

public class PositionPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the position value : ");
        int pos = sc.nextInt();
        int num = 1, count = 0,i;

        while (count < pos){
            num = num+1;
            for (i=2;i<=num;i++){
                if (num%i==0){
                    break;
                }
            }
            if (i == num){
                count = count+1;
            }
        }

        System.out.println("The "+pos+ "th Prime number is : "+num);

    }
}
