import java.util.Scanner;

public class Question_three {
    //Write a function which takes in 2 numbers and returns the greater of those two
    public static void FindOutgrestNUmber(int a,int b){
        if(a>=b){
            System.out.println(a +"great_number");
        }else{
            System.out.println(b + " great_number");
        }
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you both number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        FindOutgrestNUmber(a,b);
        sc.close();

    }
}
