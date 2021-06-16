package assignmentNo6;

public class EMIAdjustmentCalculator {
    double get(double emi){
        if (emi<5000)
            return 0;
        if(emi  > 5000 && emi <= 10000){
            return 0.1 * emi;
        }
        return 0.2 * emi;
    }
}
