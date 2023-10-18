package assignments.arrays.logical;

public class CountNumbersLessThanNumber{
    public static void main(String[] args) {
        int[] arr = { 6,5,4,8 };
        int[] narr= new int[arr.length];

        for (int i=0;i< arr.length;i++){
            int count=0;
            for (int j=0;j< arr.length;j++){
                if (arr[i] > arr[j]){
                    count++;
                }
                narr[i] = count;
            }
            System.out.print(narr[i]+" ");
        }
    }
}
