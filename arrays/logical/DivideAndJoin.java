package assignments.arrays.logical;

public class DivideAndJoin {

    public static void main(String[] args) {

        int[] arr = {1,5,4,8,3,7};

        int start = 0, end = arr.length-1, mid = (end-start)/2;

        while (start < mid && mid<end){       // start = 0, 2              , mid = 2, 3

            int left_ind = start+1;   // left = 3       right = 4
            int right_ind = mid +1;

            while (left_ind < right_ind){
                int temp = arr[right_ind];    // temp = 8, 4, 3
                arr[right_ind] = arr[right_ind-1];   // arr[3] = 4, arr[2] = 5  arr[4] = 8
                arr[right_ind-1] = temp;          //arr[2] = 8  , arr[1] = 4,  arr[3] = 3               { 1 4 5 3 8 7 }
                right_ind--;
            }

            start += 2;
            mid += 1;

        }

        for (int i=0;i<2*mid-2;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
