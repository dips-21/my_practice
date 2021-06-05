package oop;

import oop.organisation.Department;
import payroll.Employee;

import payroll.Employee; //compiler will expand Employee to payroll.Employee
import payroll.SalesPerson;

import payroll.SalesPerson;
class PackageImportDemo {
    public static void main(String[] args) {
        Employee e=new Employee();
        Department d=new Department();
        SalesPerson s=new SalesPerson(100,23,40000);
    }
}