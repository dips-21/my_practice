package college;

public abstract class Student {
    String name;
    int Id;
    int age;
    String address;


    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }


    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    abstract boolean isPassed(int grade);

    public Student(String name, int id, int age, String address) {
        this.name = name;
        Id = id;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
