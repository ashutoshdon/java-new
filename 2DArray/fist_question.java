import java.util.Scanner;

public class fist_question {
    // Searching for an element x in a matrix.


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arraynumber = new int[row][col];

        for( int i = 0 ; i<row;i++){
            for(int j = 0; j<col;j++)
            arraynumber[i] [j] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i = 0; i<row;i++){
            for(int j = 0; j< col; j++){
                if(arraynumber [i][j] == x){
                    System.out.print(" location of X is" + i + j);
                }
            }
        }
        sc.close();
    }
    
}
