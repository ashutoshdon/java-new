public class Solid_Rhombus {
    public static void main(String args[]){

        int n =5; 

        for (int i = 1; i<= n; i++){
            // print fist stare
            for (int j = 1 ; j<= i; j++){
                System.out.print("*");
            }
            // print Space 
            int Space = 2*(n-i);
            for(int j = 1; j<=Space;j++){
                System.out.print(" ");
            }
            // print second row Stare
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
             // second of fist stare
        for(int i = n ; i>=1; i--){
            for (int j = 1 ; j<= i; j++){
                System.out.print("*");
            }
            // print Space 
            int Space = 2*(n-i);
            for(int j = 1; j<=Space;j++){
                System.out.print(" ");
            }
            // print second row Stare
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
