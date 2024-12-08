import java.util.Scanner;

public class fist_try {
  
    
    public static double numberNUMBER(int y , int x){
       return Math.pow(y, x);

    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter x NUMBER :-");
       int y = sc.nextInt();
       System.out.println("Enter x NUMBER :-");
       int x = sc.nextInt();
       double result = numberNUMBER(y, x);
       System.out.println(result);
       sc.close();
    }
}
