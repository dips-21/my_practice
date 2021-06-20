package payroll;

public class PartTimeStaff extends Staff{

    public PartTimeStaff(String name,String address,int numOfHour, double rateOfHour) {
        super(name, address);
        this.numOfHour = numOfHour;
        this.rateOfHour = rateOfHour;

        if(numOfHour<0||rateOfHour<0){
            throw new IllegalArgumentException("rateOfHour or number of hour cannot be negative");
        }
    }

    private int numOfHour;
    private double rateOfHour;


    public int getNumOfHour() {
        return numOfHour;
    }

    public double getRateOfHour() {
        return rateOfHour;
    }

    @Override
    double getIncome() {
        if(numOfHour<10){
            return 0;
        }
        return numOfHour*rateOfHour;
    }
}
