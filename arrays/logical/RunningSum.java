package assignments.arrays.logical;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr= {3,1,2,10,1};                                             //output : [3,4,6,16,17]

        int temp = 0;
        for (int i=0;i<arr.length;i++){
            arr[i] = arr[i]+temp;
            temp = arr[i];
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}
