package met;
import java.util.ArrayList;
import java.util.List;
class Student{
    private  String name;
        private String code;
        private String password;
        private int age;
        private String grade;

        public Student(String name,String code, String password, int age, String grade) {
            this.code = code;
            this.password = password;
            this.age = age;
            this.grade = grade;
        }
        public Student(){this("Geni","ABC","Dips",25,"A");}

        public String getName(){return name;}
        public String getCode(){return code;}
        public void setCode(String code) { code = code;}
        public String getPassword(){return password;}
        public void setPassword(String password){password=password;}

        int getAge() { return age; }

        void setAge(int age) { age = age; }

        String getGrade() { return grade; }

        void setGrade() { grade=grade; }

        @Override
        public String toString() {
            return "Student{" +
                    "code='" + code + '\'' +
                    ", password='" + password + '\'' +
                    ", age=" + age +
                    ", grade='" + grade + '\'' +
                    '}';}
}

