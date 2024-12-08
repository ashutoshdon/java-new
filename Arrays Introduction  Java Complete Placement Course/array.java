import java.util.Scanner;

public class array {
    // LINEAR SEARCH
    //Take an array as input from the user.Search for a give number X and print the index at Which it occurs.
     public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int Size = sc.nextInt();
       int []number = new int[Size];
       
       // input loop
       for(int i = 0; i <Size; i++){
          number[i] = sc.nextInt();
       }
       int x = sc.nextInt();

       for(int i = 0; i<number.length;i++){
            if(number[i]==x)
        System.out.println("X found at index "+i);
       }
       sc.close();
    
    
    
    
    }

    
}
