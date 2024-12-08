public class String_bulinding {
    

    public static void main(String args[]){
        StringBuilder sc = new StringBuilder("Helloworld");
        for (int i = 0; i<=sc.length()/2;i++){
               int front = i ;
               int back = sc.length() -i - 1;

            char charfront = sc.charAt(front);
            char charback = sc.charAt(back);

            sc.setCharAt(front, charback);
            sc.setCharAt(back, charfront);
        }
        System.out.println(sc);
    }
}
