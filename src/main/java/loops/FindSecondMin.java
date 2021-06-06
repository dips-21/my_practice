package loops;

public class FindSecondMin {
    static int findSecondMinNum(int []array){
        int firstMin=0,secondMin=0;
        if(array[0]<array[1]){
            firstMin=array[0];
            secondMin=array[1];
        }
        else{
            firstMin=array[1];
            secondMin=array[0];
        }

        for (int i = 2; i < array.length ; i++) {
            if(array[i]<firstMin){
                secondMin=firstMin;
                firstMin=array[i];
            }
            else if(array[i]<secondMin){
                secondMin=array[i];
            }
        }
        return secondMin;
    }
}
