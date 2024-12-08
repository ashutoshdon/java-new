import java.util.Scanner;

public class bASI_Funtion_three {
    public static void printFactioial(int n){
        if(n<0){
            System.out.println("Invaild number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        
        System.out.println(factorial);
        return;
    }
    public static void main( String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactioial(n);
    }
    
}
