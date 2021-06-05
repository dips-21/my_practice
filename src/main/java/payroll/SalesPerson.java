package payroll;

public class SalesPerson extends Employee {
    private double sales;
    public SalesPerson(int h,int r,double s){
        super(h,r);
        sales=s;
    }

    public double getSales(){
        return  sales;
    }
    public double income(){
        double amount=super.income();
        if(sales>=10000)
        amount+=0.5*sales;
        return amount;
    }
}
