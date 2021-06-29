package javatutorial.hr;

public class Employee {
    private int id;
    private double sal;
    private double comm;
    private static int count=0;

    public Employee(double s,double c){
        id=100 + ++count;
        sal=s;
        comm=c;
    }
    public Employee(){
        this(0,0);
    }
    public static int getCount(){return count;}
    public int getId(){return id;}
    public double getSal(){return sal;}
    public void setSal(double value){sal=value;}
    public double getComm(){return comm;}
    public void setComm(double value){comm=value;}
    public double Income(){
        return sal+comm;
    }
}

