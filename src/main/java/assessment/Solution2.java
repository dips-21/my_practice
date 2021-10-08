package assessment;

public class Solution2 {
    public static boolean MathChallenge(int num) {
      int a=0,b=1;
      while (b<=num){
          int sum=a+b;
          a=b;
          b=sum;
          if(b==num){
              return true;
          }
      }
        return false;
    }

    public static void main (String[] args) {
        // keep this function call here

        System.out.print(MathChallenge(54));
    }

}
