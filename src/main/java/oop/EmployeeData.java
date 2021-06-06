package oop;

import payroll.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    private String name;
    private double height;
    private final double weight;

    public EmployeeData(double height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public EmployeeData(double height, String name) {
        weight = 56;
        name = name;
    }

    public static EmployeeData tallestEmployee(EmployeeData[] employees) {
        EmployeeData tallestEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (tallestEmployee.height < employees[i].height) {
                tallestEmployee = employees[i];
            }
        }
        return tallestEmployee;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static void tallerThanLeft(EmployeeData[] employees) {
        EmployeeData tallerThanLeft = employees[0];
        for (int i = 1; i < employees.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (employees[i].weight < employees[j].weight)
                    tallerThanLeft = employees[i];
                break;
            }
        }
        System.out.println(tallerThanLeft + " ");
    }

    public static List<EmployeeData> higherWeightThanEmployeesOnLeft(EmployeeData[] employees) {
        List result = new ArrayList();
        for (int i = 1; i < employees.length; i++) {
            boolean highestWeightEmployee = true;
            for (int j = i - 1; j >= 0; j--) {
                if (employees[i].weight < employees[j].weight) {
                    highestWeightEmployee = false;
                    break;
                }
                System.out.println();
            }
            if (highestWeightEmployee) {
                result.add(employees[i]);
                 System.out.println(employees[i]);
            }

        }
        return result;
    }
}
