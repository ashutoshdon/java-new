public class Number_pyramid {

    public static void main(String args[]){
        int n = 5 ;

        // out loop
        for (int i = 1; i<=n ; i++){
            // print space
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for( int j = 1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    
}
