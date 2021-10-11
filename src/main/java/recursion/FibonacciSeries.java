package recursion;

public class FibonacciSeries {
static int count=0;
// 0 1 1 2 3 5
    int getNth(int num){   //5   //1 2 3 4 5   1+2=3  3+3=6  6+4=10  10+5=15   //15
       count++;
        if (num==0){                    //5-1=4   5+4=9    9+3=12 12+2=14  14+1=15
            return 0;                   //
        }                               //
        if(num==1){
            return 1;
        }
        return getNth(num-1)+ getNth(num-2);
    }

}
