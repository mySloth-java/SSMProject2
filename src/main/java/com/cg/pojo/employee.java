package com.cg.pojo;

public class employee {
    private Integer empID;
    private String empName;
    private Integer age;
    private String sex;
    private String email;

    @Override
    public String toString() {
        return "employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public employee() {
    }

    public employee(Integer empID, String empName, Integer age, String sex, String email) {
        this.empID = empID;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
