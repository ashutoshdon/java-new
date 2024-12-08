import java.util.Scanner;

public class Two_array {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("pleace enter ROW & COL");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]size = new int[row][col];
        
        for(int i = 0; i< row; i++){
            for(int j = 0; j<col;j++){
                size[i] [j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(size[i][j]+ " ");
            }
            System.out.println();
        }

        sc.close();
    }
}