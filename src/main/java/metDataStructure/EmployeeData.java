package metDataStructure;
import java.util.*;

public class EmployeeData {
        private Node tos;

        static class Node {
            int empId;
            String empName;
            double salary;

            Node next;
            Node(int id, String name, double sal) {
                empId = id;
                empName = name;
                salary = sal;
                next = null;
            }
        }                                                    //Servlets, Javabeans, JDBC, JNI,

        public void createStack() {
            tos = null;
        }
        public void addEmployee(int id, String name, double sal) {
            Node node = new Node(id,name,sal);
            if(tos == null)
                tos = node;
            else
                node.next = tos;
                tos = node;
        }
        public void deleteEmployee() {
            if(tos == null)
                System.out.println("Empty stack");
            else {
                Node temp =  tos;
                tos = temp.next;
                System.out.println(temp.empId+" Employee deleted");
            }
        }
        public void searchEmployee(int id) {
            if (tos == null)
                System.out.println("Empty");
            else {
                Node temp = tos;
                while (temp != null && temp.empId != id)
                    temp = temp.next;
                if (temp == null)
                    System.out.println("Employee not found");
                else
                    System.out.println("Employee found");
            }
        }
        public void printEmployee() {
            if (tos == null)
                System.out.println("Empty");
            else {
                Node temp = tos;
                while (temp != null) {
                    System.out.println(temp.empId+"	"+temp.empName+"	"+temp.salary);
                    temp = temp.next;
                }
            }
        }
}
