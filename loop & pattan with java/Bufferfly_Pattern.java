public class Bufferfly_Pattern {

    public static void main(String args[]){
        int n = 5;
        // print stare
        for (int i =1; i<=n; i++){
        for (int j = 1 ; j <=i ;j++){
        System.out.print("*");
       }

       // print Space
        int Space = 2 * (n-i);
        for(int j=1; j<=Space;j++){
            System.out.print(" ");

        }
        // print second part stare
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
       System.out.println();

    }

    // second part 

     for (int i =n; i>=1; i--){
        for (int j = 1 ; j <=i ;j++){
        System.out.print("*");
       }

       // print Space
        int Space = 2 * (n-i);
        for(int j=1; j<=Space;j++){
            System.out.print(" ");

        }
        // print second part stare
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
       System.out.println();
    }
        
    }
}