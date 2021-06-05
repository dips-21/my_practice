package oop;

public class Employee {
    static String groupName="bcg";
    int id;
    String name;
    int age;
    double salary;

     int getId() {
        return id;
    }

    void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
         int i=6;int j=8;
        this.age = age;
    }

     protected double getSalary() {
         return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    static String getCompanyName(){
        System.out.println(groupName );
       Employee e=new Employee();
       e.getSalary();
         return "cdac";
    }
    class Wallet{
         void f(){
            int age= getAge();
         }
    }


}
