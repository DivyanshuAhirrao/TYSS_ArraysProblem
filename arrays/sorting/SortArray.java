package assignments.arrays.sorting;

public class SortArray {
    public static void main(String[] args) {

        int[] arr1 = {2, 6, 7, 3, 5};
        for (int a=0;a<arr1.length;a++){
            System.out.print(arr1[a]+" ");
        }
        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                int temp = 0;
                if( arr1[i] > arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j]= temp;
                }
            }

        }
        System.out.println();
        for (int a=0;a<arr1.length;a++){
            System.out.print(arr1[a]+" ");
        }

    }

}
