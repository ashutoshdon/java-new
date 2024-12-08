public class second_String {
    
    public static void main(String []args){
        String note = "jump";
        String note1 = "On_tree";

        String FullName = note+""+note1;
       // System.out.println(FullName);
       for(int i = 0 ; i < FullName.length();i++){
        System.out.println(FullName.charAt(i));
       }
    }
}
