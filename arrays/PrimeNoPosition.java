package assignments.arrays;

import java.util.Scanner;

public class PrimeNoPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Prime number ");
        int num = sc.nextInt();
        int count = 0;

        for (int i=2;i<num;i++){
            if (num%i==0){
                count++;
            }
        }

        if (count==0) {
            System.out.println("Position of given prime number is : " + nth_PrimeNo(num));
        }
        else System.out.println("Not a prime Number !!");
    }

    public static int nth_PrimeNo(int n){
        int[] primeno = new int[1000];
        int num = 3;
        int index =0, i= 0;
        primeno[0] = 2;

        while (num<=n){
            for (i=0;i<=index;i++){
                if (num%primeno[i]==0){
                    break;
                }
            }
            if (i>index){
                primeno[++index] = num;
            }
            else
            num++;
        }

        return index+1;
    }


}

