package PracticeInterviewSelenium;

public class IsStringPalindrome {

    public void isStringPalindrome(String name){
        String originalString = name ;
        String reverseString = "" ;
         char ch;
        for (int i = 0; i < originalString.length() ;i++) {
            ch=originalString.charAt(i);
            reverseString= ch + reverseString;
        }

        System.out.println(reverseString);
        if(originalString.equalsIgnoreCase(reverseString)) {
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println(" not palindrome");
        }

    }

    public static void main(String[] args) {
        IsStringPalindrome isStringPalindrome = new IsStringPalindrome();
        isStringPalindrome.isStringPalindrome("NAYAN");
        isStringPalindrome.isStringPalindrome("hello");
    }

}
