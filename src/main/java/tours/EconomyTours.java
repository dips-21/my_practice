package tours;
    @Discount
    public class EconomyTours {
        public float registered(int numOfDiscount, int numOfPassenger) {
            float rent = 500;
            if (numOfPassenger > 2) {
                rent = rent + 200 * (numOfPassenger - 2);
            }
            return rent;
        }

        public float nonRegistered(int numOfDiscount, int numOfPassenger) {
            float rent = 600;
            if (numOfPassenger > 2) {
                rent = rent + 250 * (numOfPassenger - 2);
            }
            return rent;
        }
    }
