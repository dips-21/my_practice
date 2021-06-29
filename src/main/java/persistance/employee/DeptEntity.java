package persistance.employee;

public class DeptEntity implements java.io.Serializable {

        private String deptName;
        private int deptNo;
        private String location;
        public int getNextValue() {
            return ++deptNo;
        }
    }
