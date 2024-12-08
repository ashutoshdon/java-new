
 
 public class fist {
 
    


  public static void printingArray(int one_array[]) {

    for (int i = 0; i<one_array.length;i++){
        System.out.print(one_array[i]+ " ");
    }

    System.out.println();
  
    
  }
    
    public static void main(String[]args){
        int []one_array = {5,3,2,6,7};

        for(int i = 0; i<one_array.length-1;i++){
            for(int j = 0; j<one_array.length-i-1;j++){
                if(one_array[j]>one_array[j+1]){
                    int temp = one_array[j];
                    one_array[j] = one_array[j+1];
                    one_array[j+1] = temp;
                }
            }
        }
        printingArray(one_array);
    }
}