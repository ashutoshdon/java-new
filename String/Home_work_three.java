import java.util.Scanner;

public class Home_work_three {
// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
// Example : 
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
//email = “helloWorld123@gmail.com”; username = “helloWorld123”

    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String Email = sc.next();
       String username = "";

       for ( int i = 0; i< Email.length();i++){
          if(Email.charAt(i) == '@'){
            
            break;
          }else{
            username += Email.charAt(i);
          }
       }
       System.out.println(username);
    }
}
