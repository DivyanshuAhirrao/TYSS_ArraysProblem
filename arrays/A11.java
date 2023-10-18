package assignments.arrays;

public class A11 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,-20,60,-10,40,-30};
        int max = 0;

        for (int i=1;i< arr.length;i++){
           if (arr[i] < arr[max]){
               arr[max] = arr[i];
               max++;
           }
        }
        for (int a=0;a< arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
