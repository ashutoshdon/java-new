import java.util.Scanner;

public class Question_one {
    public static int findOutAvarage(int a,int b,int c ) {
       int sum = (a+b+c)/3;
       return sum;
    
        
    }

    public static void main(String aegs[]){
     //   Enter 3 numbers from the user & make a function to print their average.
       Scanner sc =new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int sum = findOutAvarage(a, b, c);
       System.out.println(sum);
       sc.close();
    }
}