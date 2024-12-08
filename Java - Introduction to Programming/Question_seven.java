import java.util.Scanner;

public class Question_seven {
    public static void findOutNumber(int a){
        if(a<0){
            System.out.println("negative NUMBER");
        }else if(a==0){
            System.out.println("zero NUMBER");
        }else if(a>=1){
            System.out.println("positive NUMBER");
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you NUM :-");
        int a = sc.nextInt();
        findOutNumber(a);
        sc.close();
    }
}
