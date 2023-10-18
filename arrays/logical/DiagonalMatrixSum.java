package assignments.arrays.logical;

public class DiagonalMatrixSum {
    public static void main(String[] args) {
        int[][] matrix = { {4,6,3,2}, {9,4,7,3}, {2,1,5,7}, {6,9,4,2} };

        int size = 4;

        int firstDiagonal = 0, secondDiagonal = 0;

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if (i == j) {
                    firstDiagonal += matrix[i][j];
                } else if ((i+j) == size-1) {
                    secondDiagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of Diagonal Matrix is :- "+(secondDiagonal+firstDiagonal));


    }
}
