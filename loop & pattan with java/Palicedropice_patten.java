public class Palicedropice_patten {

    public static void main(String args[]){
        int n = 5;
        
        // out loop
        for(int i = 1; i<=n; i++){
            // print space 
            for(int j = 1; j<=n-i ;j++){
                System.out.print(" ");
            }
            // print number
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            // 2nd half number
            for(int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
    
}
