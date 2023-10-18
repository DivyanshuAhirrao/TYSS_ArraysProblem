package assignments.arrays.logical;

public class MatrixCountOddNum {
    public static void main(String[] args) {

        int m = 3;
        int n = 2;

        int[][] indices = {{0,1},{0,1}};
        int[][] arr = new int[m][n];

        for (int i=0;i<indices.length;i++){
            for (int j=0;j<n;j++){
                arr[indices[i][0]][j]++;
            }
            for (int j=0;j<m;j++){
                arr[j][indices[i][1]]++;
            }
        }

        int count =0;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]%2!=0){
                    count++;
                }
            }
        }

        System.out.println("Total Odd numbers :- "+count);

    }
}
