package oop.organisation;

import oop.Employee;

public class Manager extends Employee {

    void getNumberOfSubordinates(){

    }

    @Override
    protected double getSalary() {
        return super.getSalary();
    }

    void fireEmployee(Employee e){

    }
    void promoteEmployee(Employee e){
        //e.setId(35)
    }

    double getBonus(){
        return this.getSalary()/10;
    }
}
