package assignments.arrays.logical;

public class MatrixOddnums {
    public static void main(String[] args) {

        int[][] indices = { {2,1}, {0,1} };
        int m=3 , n=2;
        int[][] arr = new int[m][n];

        for (int i=0;i<indices.length;i++){
            for (int j=0;j<n;j++){
                arr[indices[i][0]][j]++;
            }
            for (int j=0;j<m;j++){
                arr[j][indices[i][1]]++;
            }
        }

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int count = 0;
       for (int i=0;i<arr.length;i++){
            for (int j=0;j<m;j++) {
                if (arr[i][j]%2!=0){
                     count++;
                }
            }
        }

        System.out.println("odd nums :- "+count);

    }
}
