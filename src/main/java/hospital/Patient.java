package hospital;

enum BedType {
    CLASSIC(500),
    AC(300), NON_AC(100);
    int price;

    BedType(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }
}

public class Patient {
    private int patientId;
    private String patientName;
    private BedType bedType;
    private int numOfDays;

    public Patient(int patientId, String patientName, BedType bedType, int numOfDays) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.bedType = bedType;
        this.numOfDays = numOfDays;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", bedType=" + bedType +
                '}';
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public BedType getBedType() {
        return bedType;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public double getBillAmount() {
        return numOfDays * bedType.getPrice();
    }
}



