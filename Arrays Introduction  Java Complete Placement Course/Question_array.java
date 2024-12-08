import java.util.Scanner;

public class Question_array {
    
    //Homework Problems
    //Take an array of names as input from the user and print them on the screen.
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter you name");
        int numname = sc.nextInt();
        sc.nextLine();
        String[] names = new String[numname];

        for(int i = 0; i<numname;i++){
            System.out.println("please enter fist name "+ (i+1));
            sc.nextLine();
        }
        System.out.println("name which are enter");
        for(String name:names){
            System.out.println(name);
        }
        sc.close();
        
    }

}
