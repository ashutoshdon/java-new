import java.util.Scanner;

public class basi_function_two {
    public static int calcaulaterSum(int a, int b){
        int sum = a * b;
        return sum;
    }

    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

      int sum = calcaulaterSum(a, b);
      System.out.println(sum);
    }
    
}
