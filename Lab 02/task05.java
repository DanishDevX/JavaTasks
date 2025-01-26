public class MatrixLetterCheck {

    public static void main(String[] args) {
      
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1}
        };

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        boolean isN = false;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                if (matrix[i][j] == 1 && matrix[i+1][j+1] == 1 && matrix[i+2][j+2] == 1 &&
                    matrix[i][j+2] == 1 && matrix[i+2][j] == 1) {
                    isN = true;
                    break;
                }
            }
            if (isN) break;
        }
    }
}
