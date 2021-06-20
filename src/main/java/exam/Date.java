package exam;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        boolean isValid=true;
        String exceptionMsg = null;
        if (month < 1 || month > 12) {
            isValid = false;
            exceptionMsg="month is invalid "+month;
        }

        else if (day < 0 || day > 31) {
            isValid = false;
            exceptionMsg = "day is invalid " + day;
        }
        else if (year <0 ){
            isValid = false;
            exceptionMsg = "day is invalid " + day;
        }
        if (!isValid)
            throw new IllegalArgumentException(exceptionMsg);
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Date{" + day +
                "/" + month +
                "/" + year +
                '}';
    }
}
