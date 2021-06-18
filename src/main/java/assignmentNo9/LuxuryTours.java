package assignmentNo9;
@Tax
public class LuxuryTours {
        public float registered(int numOfDiscount, int numOfPassenger){
            float rent=700;
            if(numOfPassenger > 2){
                rent = rent + 300 *(numOfPassenger - 2);
            }
            return rent;
        }

        public float nonRegistered(int numOfDiscount, int numOfPassenger){
            float rent=800;
            if(numOfPassenger > 2){
                rent = rent + 250 *(numOfPassenger - 2);
            }
            return rent;
        }
    }
