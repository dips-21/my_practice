package oop;

import java.util.List;

public class EmployeeDataMain {
    public static void main(String[] args) {
        double weight[] = {35, 45, 30, 65, 52};
        double height[] = {3.6, 4.5, 1.6, 2.6, 5.5};
        String name[] = {"Dipali", "Monika", "Rutuja", "Sanjana", "Radhika"};
        int totalEmployees = name.length;
        EmployeeData[] employees = new EmployeeData[weight.length];
        for (int i = 0; i < totalEmployees; i++) {
            employees[i] = new EmployeeData(height[i], weight[i], name[i]);
            System.out.println(employees[i]);
        }
        EmployeeData tallest = EmployeeData.tallestEmployee(employees);
        System.out.println("tallest is " + tallest);
        List<EmployeeData> result=EmployeeData.higherWeightThanEmployeesOnLeft(employees);
        //System.out.println("taller than left employees "+result);
        for (EmployeeData e:result)
            System.out.println(e);
    }
}
