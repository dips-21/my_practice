package project;

public class Location {
    String Street;
    int pincode;
    String area;
    String city;

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Street='" + Street + '\'' +
                ", pincode=" + pincode +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
