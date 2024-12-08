import java.util.Scanner;

public class three_question {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        // Input dimensions
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        // Input matrix elements
        int[][] matrix = new int[n][m];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is: ");
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = m - 1;

        // Spiral order traversal
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse from left to right along the top row
            for(int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // Traverse from top to bottom along the right column
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // Traverse from right to left along the bottom row, if still in bounds
            if(rowStart <= rowEnd) {
                for(int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
                rowEnd--;
            }

            // Traverse from bottom to top along the left column, if still in bounds
            if(colStart <= colEnd) {
                for(int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
                colStart++;
            }
        }

        sc.close();
    }
}


    