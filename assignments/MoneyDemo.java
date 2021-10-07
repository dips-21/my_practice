package assignments;

public class MoneyDemo {
    public static void main(String[] args) {
        Money m=new Money(5,100);
        System.out.println("m= "+m);
       Money m1=new Money(9);
        System.out.println("m1 = "+m1);
      Money result =Money.total(m,m1);
        System.out.println(result+" ");
        System.out.println("hashcode of "+result+" is "+result.hashCode());
        System.out.println("hashcode of "+ m1+" is "+m1.hashCode());
    }
}
