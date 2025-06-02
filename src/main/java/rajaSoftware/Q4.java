package rajaSoftware;

public class Q4 {
    public static void main(String[] args) {
        int[]a={2,4,5,7,1,8,9};
        int num=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==1){
                num=num+a[i];
            }
        }
        System.out.println(num);
    }
}
