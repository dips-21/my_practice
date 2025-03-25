package loops;

public class ReverseString {

    public void reverseString(String name){
        String Originalword = name;
        String emptyReverseString= " ";
        char ch;

        for (int i = 0; i < Originalword.length(); i++) {
              ch=Originalword.charAt(i);
              emptyReverseString=ch+emptyReverseString;
            //System.out.println(emptyReverseString);
        }
        System.out.println(emptyReverseString);
    }

    public static void main(String[] args) {
        ReverseString rs= new ReverseString();
        rs.reverseString("Hello");
    }
}
