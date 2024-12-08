import java.util.Scanner;

public class Question_Two {

    public static int oddNumber(int n){
        for(int i = 1;i<=n;i++){
            if(i % 2 != 0) {
              System.out.println(i);
            }
        }
         return n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :-");
        int n = sc.nextInt(); 
        
        
        oddNumber(n);
        sc.close();
    }
}