package assignments;

import java.util.Objects;

public class Distance {
    private int feet;
    private int inch;
    private int distance;


    public Distance(int feet, int inch) {
        this.feet = feet + inch / 12;
        this.inch = inch % 12;
    }

    public Distance() {
        //this.feet=5;
        //this.inch=8;
        this(5, 8);
    }
     public Distance(int inch){
     this(0,inch);
     }


    public int getDistance() {
        return distance;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;

    }

    @Override
    public String toString() {
        return "Distance{" +
                "feet=" + feet +
                ", inch=" + inch +
                '}';
    }

    static Distance add(Distance first, Distance other) {
        int feet = first.feet + other.feet;
        int inch = first.inch + other.inch;
        return new Distance(feet, inch);
    }

    //d1.add(d2)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //this.getClass()==o.getClass()
        if (!(o instanceof Distance))
            return false;

        Distance distance = (Distance) o;
        return this.feet == distance.feet && inch == distance.inch;
    }

    @Override
    public int hashCode() {
        int r=1;
        r=r*31+feet;
        r=r*31+inch;
        return r;
    }

    public int hashCode1() {
        return feet+ inch;
    }

    public static void main(String[] args) {
        Distance d = new Distance(5, 14);
        Distance d0 = new Distance(5, 14);
        Distance d1 = new Distance(6, 2);
        Distance d2 = new Distance(2, 6);
        System.out.println(d.toString());
        System.out.println(d1.toString());
        System.out.println(d == d0);
        //System.out.println(d1.equals(d0));
        Distance d4 = d1;
        // d1.equals(d4);
        Employee e = new Employee();
        //d1.equals(e);
        Distance d5 = null;
        //d5.equals(d1); //null pointer exception
        d1.equals(d5);
        Distance dist=new Distance(49);
        System.out.println(dist);
        //d.add(d1)
        Distance result= add(d1,dist);
        System.out.println("addition of "+d1+" "+dist+" = "+ result);
        System.out.println("d1 hash "+d1.hashCode()+" d2 hash "+d2.hashCode());
       // System.out.println(Integer.hashCode(6));
    }
}
