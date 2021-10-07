package hospital;

public class InHousePatient extends Patient {
    double discount;

    public InHousePatient(int patientId, String patientName, BedType bedType, int numOfDays, double discount) {
        super(patientId, patientName, bedType, numOfDays);
        this.discount = discount;
    }

    @Override
    public double getBillAmount() {
        double amount = super.getBillAmount();
        if (amount > 100000) {
            return amount - (discount / 100) * amount;
        }
        return amount;
    }
}
