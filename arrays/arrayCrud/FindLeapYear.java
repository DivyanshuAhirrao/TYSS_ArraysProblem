package assignments.arrays.arrayCrud;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n%4==0){
            System.out.println("Its a Leap Year");
        }
        else System.out.println("Not a Leap Year");

        System.out.println("=========================");
        System.out.println("Enter the number to know the factors : ");
        int num = sc.nextInt();

        System.out.println("Factors of number "+num+" are : ");
        for (int i=1;i<=num;++i){
            if (num%i==0){
                System.out.println(i);
            }
            else {
                System.out.println(i);
            }
        }

    }

}
