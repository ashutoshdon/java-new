import java.util.Scanner;

public class Question_eight {
    
    public static double NumberofSqure(int x, int y){
        return Math.pow(x, y);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X digite NUMBER");
        int x = sc.nextInt();
        System.out.println("Enter Y digite NUMBER");
        int y = sc.nextInt();
        double result = NumberofSqure(x, y);
        System.out.println(result);
        sc.close();

    }
}

