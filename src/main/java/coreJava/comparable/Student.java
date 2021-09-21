package coreJava.comparable;

import java.util.Comparator;

class Student extends Person {
    int marks;

    public Student(String name, int height, int weight, int age, int marks) {
        super(name, height, weight, age);
        this.marks = marks;

    }


    public int compareTo(Student student) {
        int result = Integer.compare(this.marks, student.marks);

        if (result == 0) {
            result = this.name.compareTo(student.name);
            if (result == 0) {
                return 0;
            }
            /*if (this.name == student.name) {
                return 0;
            }
            if (this.name.compareTo(student.name) > 0) {
                return 1;
            }
            return -1;*/
        }

        if (result > 0)
            return 1;

        return -1;
    }
}

