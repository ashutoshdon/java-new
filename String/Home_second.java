import java.util.Scanner;

public class Home_second {
//    nput a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : 
// original = “eabcdef’ ; result = “iabcdif”

public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    String newName = "";

    for(int i = 0; i<name.length();i++){
         if(name.charAt(i) == 'e'){
            newName+='i';
         }else{
           newName += name.charAt(i);
         }
    }

    System.out.println(newName);
}

}
