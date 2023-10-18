package assignments.arrays.logical;

public class RichCustomer {
    public static void main(String[] args) {

        int[][] arr = { {2,8,7}, {3,1,2}, {1,9,5} };

        int max = 0;

        for (int i=0;i<arr.length;i++){
             int temp = 0;

            for (int j=0;j<arr.length;j++){
                int tmp=0;
                temp = temp + arr[i][j];
            }

            if (temp > max){
                max = temp;
            }

        }

        System.out.println(max);

    }
}
