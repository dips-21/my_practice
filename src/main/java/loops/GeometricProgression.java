package loops;

public class GeometricProgression {
    static int sumOfGeometricProgression(int num,int commonRatio) {
        int currentTerm = 1,sum=0;
        for (int i = 0; i < num; i++) {
             sum+=currentTerm;
             currentTerm=currentTerm*commonRatio;
        }

        return sum;
    }


    public static void main(String[] args) {
        int sum=sumOfGeometricProgression(4,2);
        System.out.println("\n sum="+sum);
    }
}
