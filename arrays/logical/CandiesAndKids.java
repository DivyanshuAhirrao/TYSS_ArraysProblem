package assignments.arrays.logical;

public class CandiesAndKids{
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extraCandies= 2;

        int min=arr[0];

        for (int i=0;i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
        System.out.println();

        for (int i=0;i< arr.length;i++){
            arr[i] += extraCandies;
        }
        for (int i=0;i< arr.length;i++){
            if (arr[i] > extraCandies+min){
                System.out.print(true+" ");
            }
            else {
                System.out.print(false+" ");
            }
        }
    }
}
