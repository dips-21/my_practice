package rajaSoftware;

public class Q3 {

    public int testFunction(int[]num){
        if(num.length==0)
            return 0;
        int i=0;
        for (int j = 1; j < num.length ; j++) {
            if(num[j]!=num[i]){
                i++;
                num[i]=num[j];
            }
        }
        return i+1;
    }
}
