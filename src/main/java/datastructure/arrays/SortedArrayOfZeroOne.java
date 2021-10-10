package datastructure.arrays;

public class SortedArrayOfZeroOne {         //0 1 0 0 1 1 1 0 0
    void sortArray(int[] num) {
        int countOfZero = 0, countOfOne = 0;
        for (int i = 0; i < num.length; i++) {    //{0, 0, 0, 0, 0, 1, 1, 1, 1};
            if (num[i] == 0) {
                countOfZero++;
            }
            countOfOne++;
        }
        for (int i = 0; i < num.length; i++) {
            if (i < countOfZero) {
                num[i] = 0;
            } else {
                num[i] = 1;
            }
        }

    }
}


    /*
    static void f(float i){

    }

    public static void main(String[] args) {
        System.out.println(new Integer(10).equals(new Long(10)));
float f=20;
f(5);
        int c = 0;
        for (int i = 0; i < 3240; i++) {
            for (int j = 0; j < 3240; j++) {
                for (int k = 0; k < 3240; k++) {
                    if (i * j * k == 3240 &&i!=j)
                        c++;
                }
            }
        }
        System.out.println(c);
    }
}*/
