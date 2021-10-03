package arrays;

public class Array2D {
    int get2DArray(int[]arr){
        int[][]a={ {1,2,3},
                 {4,5,6}};

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i][i]);
        }

        for (int j = 0; j <a.length ; j++) {
            System.out.println(a[j][j]);
        }

        return 0;
    }
}
