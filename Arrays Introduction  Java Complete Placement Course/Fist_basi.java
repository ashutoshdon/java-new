
import java.util.Scanner;

public class Fist_basi{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []number= new int[n];

        for(int i = 0; i<n;i++){
             number[i] = sc.nextInt();
        }
        // print number of array
        for(int i = 0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        sc.close();
    }
}