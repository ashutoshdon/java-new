public class Inverted_Half_Pyramid_with_Number {

    public static void main(String args[]){
    int n = 7;
     // outer loop
     for (int i = 1;i <=n; i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
     }
    }
}