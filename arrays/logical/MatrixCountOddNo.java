package assignments.arrays.logical;

public class MatrixCountOddNo {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        int[][] indice = { {0,1}, {1,1} };
        int[][] arr = new int[m][n];

        for(int i=0;i<indice.length;i++){

            for (int j=0;j<n;j++){
                arr[indice[i][0]][j]++;
            }
            for (int j=0;j<m;j++){
                arr[j][indice[1][i]]++;
            }
        }

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
