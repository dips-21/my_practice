package aggregation;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class College {
    String []dept;
    String staff;

    public College(String []dept, String staff) {
        this.dept= dept;
        this.staff = staff;
    }


    public String[] getDept() {
        return dept;
    }

    public void setDept(String dept[]) {
        this.dept = dept;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    Iterator<String> getDepartmentIterator(){
        return new DeptIterator();
    }
//["compsc"] cp=0
    class DeptIterator implements Iterator<String> {
        int currentPosition = -1;

        @Override
        public boolean hasNext() {
            if (currentPosition < dept.length-1)
                return true;
            return false;
        }

        @Override
        public String next() {
            currentPosition++;
            return dept[currentPosition];
        }

    }
}
