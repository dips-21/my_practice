package assignmentNo9;

@Discount(value = 10)
public class BusinessTour {

    public float registered(int numOfDiscount, int numOfPassenger){
            float rent = 1000;
            if (numOfPassenger > 2){
                rent = rent + 500 * (numOfPassenger -2);
            }
            if(numOfDiscount > 5)
                rent = rent + 1000;
            return rent;
        }

        public float nonRegistered(int numOfDiscount, int NumOfPassenger){
            float rent = 1250;
            if (NumOfPassenger > 2){
                rent = rent + 500 * (NumOfPassenger -2);
            }
            if (numOfDiscount > 5)
                rent = rent + 2500;
            return rent;
        }
    }