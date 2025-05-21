package Test;

public class MultipleInheritance implements InterfaceA,InterfaceB {
    @Override
    public void display() {
    }


    public static void main(String[] args) {
        MultipleInheritance a=new MultipleInheritance();
        InterfaceA ia=new MultipleInheritance();
        InterfaceB ib=new MultipleInheritance();
        a.display();
       // System.out.println(a.display());
        ia.display();
        ib.display();
    }
}
