package loops;

public class MinFromArrayAllRanges {
    static void printMinOfAllRangesInArray(int []array){
        int min=Integer.MAX_VALUE;
            for (int i = 0; i < array.length ; i++) {
                if(array[i]<array.length-i-1) {
                    min = array[i];
                }
                else{
                    min= array.length-i-1;
                }
            System.out.print (min +" ");
        }

    }

    public static void main(String[] args) {
        int []array={9,3,6,10,1,8,7,12,15};
        MinFromArrayAllRanges.printMinOfAllRangesInArray(array);
    }
}

