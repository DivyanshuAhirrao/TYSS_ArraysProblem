package assignments.arrays;

public class A10 {
    public static void main(String[] args) {

        int[] arr = {54, 33, 96, 12, 75, 29};
        int[] demo = new int[arr.length];
        int j=0;

        for (int i= arr.length-1;i>=0;i--){
            demo[j] = arr[i];
            j++;
        }

        System.out.print("[ ");
        for (int i=0;i<arr.length;i++){
            System.out.print(demo[i]+" ");
        }
        System.out.print("]");


    }
}
