import java.util.Scanner;
public class just_for_try {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("pleace enter size array : --");
       int size = sc.nextInt();
       int number[] = new int[size];

       for(int i = 0; i < size;i++){
        number[i] = sc.nextInt();
       }

       boolean isAscending = true;

       for(int i = 0; i<number.length-1;i++){
        if(number[i]>number[i+1]){
            isAscending =false;
        }
       }
        
       if(isAscending){
        System.out.println("it is sort array");
       }else{
        System.out.println("it is not sort array");
       }
    }
}

