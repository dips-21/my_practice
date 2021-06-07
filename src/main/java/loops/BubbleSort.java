package loops;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSortArray(int []array){
        System.out.println(Arrays.toString(array));
        boolean isSwap=false;
        for (int start = 0; start < array.length; start++) {
            for (int i = 0; i < array.length-1-start ; i++) {
                if(array[i]>array[i+1]){
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    isSwap=true;
                }
            }

            System.out.println(Arrays.toString(array));
            if(isSwap==false){
                break;
            }

        }

    }
}
