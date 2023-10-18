package assignments.arrays.logical;

public class RearangeFirstLast {
    public static void main(String[] args) {

        int[] arr = {4,9,3,8,1,6};

        int start =0, last= arr.length-1;

        for (int i=0;i<arr.length;i++){

            if (i%2==0) {
                arr[i] = arr[start++];
            }
            else {
                arr[i] = arr[last--];
            }

        }

        for (int i=0;i<4;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
