import java.util.Scanner;

public class Question_five {
    public static void voteRight (int a){
        if(a<=0){
            System.out.println("invailed number");
        }else if(a<=18){
            System.out.println("You are NOT elgible for voteing");
        }else if(a>=18){
            System.out.println("YOU ARE ELIGBLE FOR VOTEING");
        }
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you age :");
        int a = sc.nextInt();
        voteRight(a);
        sc.close();

    }

}
