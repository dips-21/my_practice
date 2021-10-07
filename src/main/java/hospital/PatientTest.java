package hospital;

import resource.Accountant;
import resource.Employee;
import resource.SalesPerson;

public class PatientTest {
    public static void main(String[] args) {
        Patient[] patients = {new Patient(1, "Madhavi", BedType.CLASSIC, 10),
                new InHousePatient(2, "Mayuri", BedType.CLASSIC, 10, 7),
                new Patient(3, "Aashu", BedType.CLASSIC, 10),
                new InHousePatient(1, "Supriya", BedType.NON_AC, 5, 6),
                new InHousePatient(2, "Kasturi", BedType.AC, 7, 9)};
        for (Patient patient : patients) {
            System.out.println(patient + " " + patient.getBillAmount());
        }
    }
}

