package resource;
//Person name age height weigh sex
//Girl(name,age,height,weight,hairlen) { Person(..) LongHair}
//Boy

public class Accountant extends Employee {

    Accountant(int hours, int rate) {
        super(hours, rate);
    }

    @Override
    public double getIncome() {
        double income = super.getIncome();
        return income + 0.1 * income;
    }

    // Accountant accountant=new Accountant(55,5);
    //   accountant.getIncome()


}
