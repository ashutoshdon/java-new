import java.util.Scanner;

public class Home_fist {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String []array = new String[num];

        int TotalNumber = 0;

        for(int i = 0; i<array.length;i++){
             array[i] = sc.next();
            TotalNumber+=array[i].length();
    }
    System.out.println(TotalNumber);
    sc.close();
}
}
