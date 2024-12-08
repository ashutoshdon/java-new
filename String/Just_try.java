import java.util.Scanner;

public class Just_try {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       String going = sc.next();
       String go = "";
       for(int i = 0 ; i < going.length();i++){
        if(going.charAt(i)=='s'){
            go += 'i';
        }else{
            go += going.charAt(i);
        }
        
       }
       System.out.println(go);
        sc.close();
        }
}
