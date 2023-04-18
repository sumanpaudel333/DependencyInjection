package org.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    List<String> phone;
    List<Set> addresses;
    Map<String, String> courses;
    private String empName;

    public Employee(List<String> phone, List<Set> addresses, Map<String, String> courses, String empName) {
        this.phone = phone;
        this.addresses = addresses;
        this.courses = courses;
        this.empName = empName;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "phone=" + phone +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", empName='" + empName + '\'' +
                '}';
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<Set> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Set> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
