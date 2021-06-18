package met;

public class Interval {
    private int hours;
    private int min;
    private int sec;

    public Interval(int hours, int min, int sec) {
        this.sec = sec % 60;
        min = min + sec / 60;
        this.min = min % 60;
        this.hours = hours + min / 60;
    }

    public Interval(int hours, int min) {
        this(hours, min, 0);
    }
    @Override
    public String toString() {
        return "Interval{" +
                "hours=" + hours +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }

    void add(Interval interval) {
        int sec_sum = interval.sec + this.sec;
        this.sec = sec % 60;
        int min_sum = this.min + interval.min + this.sec / 60;
        this.min = min_sum % 60;
        int hours_sum = interval.hours + this.hours + this.min / 60;
        this.hours = hours_sum;
    }

    @Override
    public boolean equals(Object other) { //SubInterval extends Interval  subInterval
       /* if (!(other instanceof Interval)){
            return false;
        }*/
        if (other.getClass() != Interval.class) {
            return false;
        }
        Interval otherInterval = (Interval) other;
        return hours == otherInterval.hours && min == otherInterval.min && sec == otherInterval.sec;
    }

}
 /*void add(int hours,int min,int sec){

    }
    */

