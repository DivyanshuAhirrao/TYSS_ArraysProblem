package assignments.arrays.logical;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};

        int rotate = 1;

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0;i<rotate;i++){
            int j, last;

            last = arr[arr.length-1];

            for (j = arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }

            arr[0] = last;
        }
        System.out.println();
        System.out.println("-----------After rotation-----------");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


}
