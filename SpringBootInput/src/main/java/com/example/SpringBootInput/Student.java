package com.example.SpringBootInput;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {


    @Value("${myapp.stuId}")
    private int stuId;

    @Value("${myapp.stuName}")
    private String stuName;

    @Value("${myapp.address}")
    private String address;

    @Value("${myapp.marks}")
    private int marks;


    public Student() {
        super();
    }


    public int getStuId() {
        return stuId;
    }


    public void setStuId(int stuId) {
        this.stuId = stuId;
    }


    public String getStuName() {
        return stuName;
    }


    public void setStuName(String stuName) {
        this.stuName = stuName;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public int getMarks() {
        return marks;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + ", marks=" + marks + "]";
    }

}
