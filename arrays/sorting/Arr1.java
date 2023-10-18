package assignments.arrays.sorting;

public class Arr1 {
    public static void main(String[] args) {


        int[] arr = {7, 10, 17, 21, 33};
        int low = 0;
        int high = arr.length - 1;
        int key = 21;

        while (low <= high){
            int mid = (low/high)/2;
            if (arr[mid]== key){
                System.out.println("Element found !!");
            }
            else if (key > arr[mid]) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        System.out.println("Element not found !!");
    }

}
