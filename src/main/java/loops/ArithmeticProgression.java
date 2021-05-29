package loops;

public class ArithmeticProgression {
    static int sumofArithmeticProgression(int num,int commonRatio){
        int currentTerm=1,sum=0;
        for(int i=0;i<num;i++)
        {
            sum+=currentTerm;
            currentTerm=currentTerm+commonRatio;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum=sumofArithmeticProgression(6,3);
        System.out.println("\n sum="+sum);
    }
}

