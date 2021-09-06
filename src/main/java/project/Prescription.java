package project;

public class Prescription {
     int prescriptionId;
     String doctorId;
     String medicineName;

     public int getPrescriptionId() {
          return prescriptionId;
     }

     public void setPrescriptionId(int prescriptionId) {
          this.prescriptionId = prescriptionId;
     }

     public String getDoctorId() {
          return doctorId;
     }

     public void setDoctorId(String doctorId) {
          this.doctorId = doctorId;
     }

     public String getMedicineName() {
          return medicineName;
     }

     public void setMedicineName(String medicineName) {
          this.medicineName = medicineName;
     }

     @Override
     public String toString() {
          return "Prescription{" +
                  "prescriptionId=" + prescriptionId +
                  ", doctorId='" + doctorId + '\'' +
                  ", medicineName='" + medicineName + '\'' +
                  '}';
     }
}
