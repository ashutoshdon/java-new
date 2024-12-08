import java.util.Scanner;

public class Question_two {
    //Find the maximum & minimum number in an array of integers. 
    //Integer.MAX_VALUE -that specifies that stores the maximum possible value for any integer variable in Java
    //Integer.MIN_VALUE --that specifies that stores the minimum possible value for any integer variable in Java. 
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("PLEACE enter array number");
    int numnumber = sc.nextInt();
    int []array = new int[numnumber];

    for(int i = 0; i<numnumber;i++){
        System.out.println("pleace array list"+(i+1));
        array[i] =sc.nextInt();
    }
   int max = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE;

  for(int i =0 ; i<array.length;i++){
    if(array[i] <min){
        min = array[i];
    }
    if(array[i] > max) {
        max = array[i];
    }
  }
  System.out.println("largest number is:" + max);
  System.out.println("Smallest number is :" + min);
}
}
