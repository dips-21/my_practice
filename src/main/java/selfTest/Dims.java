package selfTest;

public class Dims {
           public static void main(String[] args) {
               /*int []c={7,8,9};
               int m=c[0];*/
               int[] [] a = {{1,2,}, {3,4}}; //array of array ,2d array
                int[] b = (int[]) a[1];   //{3,4}
                Object o1 = a;
              int[][] a2 = (int[][]) o1;
                 int[] b2 = (int[]) o1;   //cast 2d array to 1d so class cast
               System.out.println(b[1]);
           }
}

