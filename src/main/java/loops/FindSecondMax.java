package loops;

public class FindSecondMax {
    static int findSecondMaxNum(int[] array) {
        int firstmax = 0, secondMax = 0;
        if (array[0] > array[1]) {
            firstmax = array[0];
            secondMax = array[1];
        } else {
            firstmax = array[1];
            secondMax = array[0];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstmax) {
                secondMax=firstmax;
                firstmax=array[i];
            }
            else if(array[i]>secondMax){
                secondMax=array[i];
            }
        }

return secondMax;
    }









}
