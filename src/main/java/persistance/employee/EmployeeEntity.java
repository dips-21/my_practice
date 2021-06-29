package persistance.employee;

import java.util.Date;

public class EmployeeEntity implements java.io.Serializable {

    private int empNo;
    private String empName;
    private String empJob;
    private int empMgr;
    private Date hireDate;
    public int empSalary;
    public int empCommission;
    public int empDeptNo;


    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public int getEmpMgr() {
        return empMgr;
    }

    public void setEmpMgr(int empMgr) {
        this.empMgr = empMgr;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpCommission() {
        return empCommission;
    }

    public void setEmpCommission(int empCommission) {
        this.empCommission = empCommission;
    }

    public int getEmpDeptNo() {
        return empDeptNo;
    }

    public void setEmpDeptNo(int empDeptNo) {
        this.empDeptNo = empDeptNo;
    }
}

