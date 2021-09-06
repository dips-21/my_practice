package project;

public class MainTest {
    public static void main(String[] args) {
        Patient patient=new Patient("dips",100,"female",100,"Aurangabad");
        Patient patient1=new Patient("jaanhvi",101,"female",101,"Aurangabad");
        System.out.println(patient);
        System.out.println(patient1);

        System.out.println(patient.patientId);


    }
}
