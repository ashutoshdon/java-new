import java.util.Scanner;

public class Question_four {
    //Write a function that takes in the radius as input and returns the circumference of a circl
   public static float circumference( float r){
     float sum =2 * 3.14159f * r;
     return sum;
      
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter radius :");
    float r = sc.nextFloat();
    
    float sum =circumference(r);
    System.out.println(" the circumference is :" + sum);
    sc.close();
   }
}
