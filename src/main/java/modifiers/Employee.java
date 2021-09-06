package modifiers;

public class Employee {
    private int id;
    private String name;
    public String city;
    private int sal;
    protected int sal1;
    protected int age;

    public Employee(int id, String name, String city, int sal){
        this(id,name,city,sal,18);
    }
    public Employee(int id, String name, String city, int sal,int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        validateSalary(sal);
        this.sal = sal;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSal() {
        return sal;
    }

    public int getAge(){
        return age;
    }

    public void setSal(int sal) {
        validateSalary(sal);
        this.sal = sal;
    }

    private void validateSalary(int sal) {
        if (sal < 0)
            throw new IllegalArgumentException("Salary cannot be negative : "+sal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                " ,sal='" + sal + '\'' +
                '}';
    }

    protected int sal1(){
        return 0;
    }

    protected int secret(){
        return 1;
    }
}
