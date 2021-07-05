package coreJava.immutable;

public class Address {
   private String city;
    private String state;
    int pincode;

    public Address(String city, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
