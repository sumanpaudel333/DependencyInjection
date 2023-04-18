package org.example;

public class Student {
    private int id;
    private String StudentName;
    private String StudentAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public Student(int id, String studentName, String studentAddress) {
        this.id = id;
        StudentName = studentName;
        StudentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}

